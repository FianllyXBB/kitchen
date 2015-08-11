package com.family.kitchen.back.login.web.action;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/backmain")
public class MainAction {

	@RequestMapping("/main")
	public ModelAndView mainpage() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/back/main");
		return modelAndView;
	}
}
