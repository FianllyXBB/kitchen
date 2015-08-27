package com.family.kitchen.back.login.web.action;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.back.combo.service.BackComboService;
import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.util.PageSet;

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

	@Autowired
	private BackComboService backComboService;
	
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
	
	@RequestMapping("/comboQuery")
	public ModelAndView comboQuery(@RequestParam(defaultValue="1") Integer pagenumber, @RequestParam(defaultValue="10") Integer pagesize,
			String ordercolumn, @RequestParam(defaultValue="asc") String ordermethod, String categoryid) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		PageSet<ComboAo> pageData = backComboService.selectAll(pagenumber, pagesize, ordercolumn, ordermethod, categoryid);
		modelAndView.addObject("pageData", pageData);
		modelAndView.setViewName("/back/comboQuery");
		return modelAndView;
	}
	
	@RequestMapping("/categoryQuery")
	public ModelAndView categoryQuery() throws IOException{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/back/categoryQuery");
		return modelAndView;
	}
}
