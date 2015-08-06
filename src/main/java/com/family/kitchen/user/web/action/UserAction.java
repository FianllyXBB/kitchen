package com.family.kitchen.user.web.action;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.user.ao.UserAo;
import com.family.kitchen.user.po.User;
import com.family.kitchen.user.service.UserService;
import com.family.kitchen.user.web.vo.UserVo;
import com.family.kitchen.util.ImageCode;
import com.family.kitchen.util.UUIDUtil;

@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getImageCode")
	public void getImageCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ImageCode ic = new ImageCode();
		BufferedImage image = ic.getImage();
		request.getSession().setAttribute("session_imageCode", ic.getText());	
		ImageCode.output(image, response.getOutputStream());
	}
	
	@RequestMapping("/regist")
	public ModelAndView registForm(HttpServletResponse response) throws IOException {
		//response.sendRedirect("/WEB-INF/views/test/user/regitst.jsp");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/fore/user/regist");
		return modelAndView;
	}
	
	@RequestMapping("/registSubmit")
	public ModelAndView regist(HttpServletRequest request, UserVo userVo, String imageCode) throws IOException {
		Map<String, String> errors = new HashMap<String, String>();
		ModelAndView modelAndView = new ModelAndView();
		if(request.getMethod().equalsIgnoreCase("get")){
			System.out.println("cao");
			modelAndView.setViewName("/errors/404");
			return modelAndView;
		}
		
		if (userVo.getUsername().trim() == "" || userVo.getUsername().trim().length() == 0) {
			errors.put("usernameError", "用户名不能为空");
		}else if (userService.findUserByUsername(userVo.getUsername()) != null) {
			errors.put("usernameError", "用户名已被其他用户注册");
		}
		
//		if (userVo.getEmail().trim() == "" || userVo.getEmail().trim().length() == 0) {
//			errors.put("emailError", "邮箱不能为空");
//		}else if (userService.findUserByEmail(userVo.getEmail()) != null) {
//			errors.put("emailError", "邮箱已被注册");
//		}
		
		if (userVo.getPassword().trim() == "" || userVo.getPassword().trim().length() == 0) {
			errors.put("passwordError", "密码不能为空");
		}
		if (userVo.getPhonenumber().trim() == "" || userVo.getPhonenumber().trim().length() == 0 ) {
			errors.put("phonenumberError", "手机号码不能为空");
		}else if (userService.findSingleUser(new UserVo(userVo.getPhonenumber(), null)) != null) {
			errors.put("phonenumberError", "手机号码已被其他用户注册");
		}
		
		if (imageCode == null || !imageCode.equalsIgnoreCase((String) request.getSession().getAttribute("session_imageCode"))) {
			errors.put("imageCodeError", "验证码错误");
		}
		
		if (errors != null && errors.size() > 0) {
			modelAndView.addObject("userVo", userVo);
			modelAndView.addObject("errors", errors);
			modelAndView.setViewName("/fore/user/regist");
			return modelAndView;
		}
		userVo.setUserid(UUIDUtil.randomUUID());
		userVo.setCode(UUIDUtil.randomUUID() + UUIDUtil.randomUUID());
		User user = new User();
		BeanUtils.copyProperties(userVo, user);
		userService.add(user);
		modelAndView.setViewName("/fore/user/registSuccess");
		return modelAndView;
	}
	
	@RequestMapping("/validateForm")
	public @ResponseBody String validateForm(UserVo userVo) throws IOException {	
		UserAo userAo = userService.findSingleUser(userVo);
		if (userAo == null) {
			return "true";
		}
		return "false";
	}
	
	@RequestMapping("/signin")
	public ModelAndView signin() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/fore/user/signin");
		return modelAndView;
	}
	
	@RequestMapping("/signinSubmit")
	public ModelAndView signinSubmit(HttpServletRequest request , String username, String password, String imageCode) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		Map<String, String> errors = new HashMap<String, String>();
		if (imageCode != null) {
			if (imageCode.trim()=="" || !imageCode.equalsIgnoreCase((String) request.getSession().getAttribute("session_imageCode"))) {
				errors.put("imageCodeError", "验证码错误");
				modelAndView.addObject("username", username);
				modelAndView.addObject("password", password);
				modelAndView.addObject("errors", errors);
				modelAndView.addObject("loginAgain", true);
				modelAndView.setViewName("/fore/user/signin");
				return modelAndView;
			}
		}
		
		UserAo userAo = userService.signin(username, null);
		
		if (userAo != null && userAo.getPassword().equals(password)) {
			modelAndView.addObject("userAo", userAo);
			modelAndView.setViewName("/fore/combo/showpage");
			return modelAndView;
		}
		userAo = userService.signin(null, username);
		if (userAo != null && userAo.getPassword().equals(password)) {
			modelAndView.addObject("userAo", userAo);
			modelAndView.setViewName("/fore/combo/showpage");
			return modelAndView;
		}
		errors.put("error", "用户名/手机号码 或 密码错误");
		modelAndView.addObject("errors", errors);
		modelAndView.addObject("username", username);
		modelAndView.addObject("password", password);
		modelAndView.addObject("loginAgain", true);
		modelAndView.setViewName("/fore/user/signin");
		return modelAndView;
	}
	
}
