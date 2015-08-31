package com.family.kitchen.back.login.web.action;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 *<p>Title:MainAction.java</p>
 * @Package com.family.kitchen.back.login.web.action
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月12日 下午1:23:02
 */
@Controller
@RequestMapping("/backmain")
public class MainAction {
	
	@RequestMapping("/main")
	public ModelAndView mainpage() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/back/main");
		return modelAndView;
	}
	
	@RequestMapping("/left")
	public ModelAndView leftmenu() throws IOException{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/back/left");
		return modelAndView;
	}
	
	
	
}
