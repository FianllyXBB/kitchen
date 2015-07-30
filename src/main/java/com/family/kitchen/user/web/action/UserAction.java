package com.family.kitchen.user.web.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.user.po.User;
import com.family.kitchen.user.service.UserService;
import com.family.kitchen.user.web.vo.UserVo;
import com.family.kitchen.util.UUIDUtil;

@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/registForm")
	public ModelAndView registForm(HttpServletResponse response) throws IOException {
		//response.sendRedirect("/WEB-INF/views/test/user/regitst.jsp");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/test/user/regist");
		return modelAndView;
	}
	
	@RequestMapping("/regist")
	public ModelAndView regist(HttpServletRequest request, UserVo userVo) throws IOException {
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
		
		if (userVo.getEmail().trim() == "" || userVo.getEmail().trim().length() == 0) {
			errors.put("emailError", "邮箱不能为空");
		}else if (userService.findUserByEmail(userVo.getEmail()) != null) {
			errors.put("emailError", "邮箱已被注册");
		}
		
		if (userVo.getPassword().trim() == "" || userVo.getPassword().trim().length() == 0) {
			errors.put("passwordError", "密码不能为空");
		}
		if (userVo.getPhonenumber().trim() == "" || userVo.getPhonenumber().trim().length() == 0 ) {
			errors.put("phonenumberError", "手机号码不能为空");
		}
		
		if (errors != null && errors.size() > 0) {
			modelAndView.addObject("userVo", userVo);
			modelAndView.addObject("errors", errors);
			modelAndView.setViewName("/test/user/regist");
			return modelAndView;
		}
		userVo.setUserid(UUIDUtil.randomUUID());
		userVo.setCode(UUIDUtil.randomUUID() + UUIDUtil.randomUUID());
		User user = new User();
		BeanUtils.copyProperties(userVo, user);
		userService.add(user);
		modelAndView.setViewName("/test/user/registSuccess");
		return modelAndView;
	}
	
	
	
	
}
