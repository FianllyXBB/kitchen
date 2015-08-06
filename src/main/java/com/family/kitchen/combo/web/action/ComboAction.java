package com.family.kitchen.combo.web.action;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.combo.service.ComboService;
import com.family.kitchen.combo.web.vo.ComboVo;

@RequestMapping("/combo")
public class ComboAction {

	@Autowired
	private ComboService comboService;
	
	@RequestMapping("/selectAll")
	public ModelAndView selectAll(@RequestParam(defaultValue="1") Integer pagenumber, @RequestParam(defaultValue="10") Integer pagesize,
			String ordercolumn, @RequestParam(defaultValue="asc") String ordermethod) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		List<ComboVo> list = comboService.selectAll(pagenumber, pagesize, ordercolumn, ordermethod);
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
}
