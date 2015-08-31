package com.family.kitchen.back.combo.web.action;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.back.combo.ao.BackComboAo;
import com.family.kitchen.back.combo.service.BackComboService;
import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.util.PageSet;

/**
 * 
 *<p>Title:BackComboAction.java</p>
 * @Package com.family.kitchen.back.combo.web.action
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月31日 上午11:15:05
 */
@Controller
@RequestMapping("/backCombo")
public class BackComboAction {

	@Autowired
	private BackComboService backComboService;
	
	@RequestMapping("/comboQuery")
	public ModelAndView comboQuery(@RequestParam(defaultValue="1") Integer pagenumber, @RequestParam(defaultValue="10") Integer pagesize,
			String ordercolumn, @RequestParam(defaultValue="asc") String ordermethod, String categoryid) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		PageSet<ComboAo> pageData = backComboService.selectAll(pagenumber, pagesize, ordercolumn, ordermethod, categoryid);
		pageData.setCurrentPage(pagenumber);
		modelAndView.addObject("pageData", pageData);
		modelAndView.setViewName("/back/comboQuery");
		return modelAndView;
	}
	
	@RequestMapping("/beforeUpdateCombo")
	public ModelAndView beforeUpdateCombo(String comboid) throws IOException{
		//CategoryAo categoryAo = backCategoryService.selectSingleCategoryByPri(categoryid);
		BackComboAo backComboAo = backComboService.selectSingleComboByPri(comboid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("backComboAo", backComboAo);
		modelAndView.setViewName("/back/backComboDetail");
		return modelAndView;
	}
}
