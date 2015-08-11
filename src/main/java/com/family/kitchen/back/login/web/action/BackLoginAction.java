package com.family.kitchen.back.login.web.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.family.kitchen.user.ao.UserAo;

/**
 * 
 *<p>Title:BackLoginAction.java</p>
 * @Package com.family.kitchen.back.login.web.action
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月11日 上午9:25:03
 */
@Controller
@RequestMapping("/backlogin")
public class BackLoginAction {

	@RequestMapping("/login")
	public String login() throws IOException {	
		return "/back/login";
	}
	
//	@RequestMapping(value="/loginSubmit",method=RequestMethod.POST)
//	public @ResponseBody  String loginSubmit(HttpServletResponse response, HttpServletRequest request, String username, String password) throws IOException {
//		Map<String, String> errors = new HashMap<String, String>();
//		//StringBuffer sbf = new StringBuffer();
//		if (username == null || username.trim() == "") {
//			errors.put("usernameError", "用户名不能为空");
//		}
//		if (password == null || password.trim() == "") {
//			//sbf.append("passwordError:密码不能为空");
//			errors.put("passwordError", "密码不能为空");
//		}
//		if (errors != null && errors.size() > 0) {
//			return JSON.toJSONString(errors);
//		}
//		if (!username.equals("admin") && !password.equals("admin")) {
//			errors.put("loginError", "用户名或密码错误");
//			return JSON.toJSONString(errors);
//		}
//		
//		UserAo userAo = new UserAo();
//		userAo.setUsername(username);
//		request.getSession(true).setAttribute("userAo", userAo);
//		response.sendRedirect("http:localhost:8080/kitchen/backlogin/login.ms");
//		return null;
//	}
	
	@RequestMapping(value="/loginSubmit",method=RequestMethod.POST)
	public void loginSubmit(HttpServletResponse response, HttpServletRequest request, String username, String password) throws IOException {
		Map<String, String> errors = new HashMap<String, String>();
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		//StringBuffer sbf = new StringBuffer();
		if (username == null || username.trim() == "") {
			errors.put("usernameError", "用户名不能为空");
		}
		if (password == null || password.trim() == "") {
			//sbf.append("passwordError:密码不能为空");
			errors.put("passwordError", "密码不能为空");
		}
		if (errors != null && errors.size() > 0) {
			String s =JSON.toJSONString(errors);
			response.getWriter().write(s);
			return;
		}
		if (!username.equals("admin") && !password.equals("admin")) {
			errors.put("loginError", "用户名或密码错误");
			response.getWriter().write(JSON.toJSONString(errors));
			return;
		}
		errors.put("loginSuccess", "true");
		UserAo userAo = new UserAo();
		userAo.setUsername(username+"hahd");
		request.getSession(true).setAttribute("userAo", userAo);
		response.getWriter().write(JSON.toJSONString(errors));
		return;
		//response.sendRedirect("http:localhost:8080/kitchen/backlogin/login.ms");
	}
	
	@RequestMapping("/main")
	public String main() throws IOException {
		return "redirect:/backmain/main.ms";
	}
}
