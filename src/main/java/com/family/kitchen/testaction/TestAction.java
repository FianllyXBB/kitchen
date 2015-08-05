package com.family.kitchen.testaction;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestAction {

	@RequestMapping("/showpage")
	public ModelAndView showPage() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/fore/combo/showpage");
		return modelAndView;
	}
	
	@RequestMapping("/checkout")
	public ModelAndView checkOut() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/fore/fortunecat/checkout");
		return modelAndView;
	}
	
	@RequestMapping("/fruithome")
	public ModelAndView privatefruit() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/fore/privatefruit/fruithome");
		return modelAndView;
	}
	
	@RequestMapping("/privatehome")
	public ModelAndView privatehome() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/fore/privatekit/privatehome");
		return modelAndView;
	}
	
}
