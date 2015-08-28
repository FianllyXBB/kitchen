package com.family.kitchen.back.user.web.action;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.back.user.service.BackUserService;

/**
 * 
 *<p>Title:BackUserAction.java</p>
 * @Package com.family.kitchen.back.user.web.action
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月28日 下午4:49:42
 */
@Controller
@RequestMapping("/backUserAction")
public class BackUserAction {
	
	@Autowired
	private BackUserService backUserService;
	
	@RequestMapping("/selectAll")
	public ModelAndView selectAll(@RequestParam(defaultValue="1") Integer pagenumber, @RequestParam(defaultValue="10") Integer pagesize,
			String ordercolumn, @RequestParam(defaultValue="asc") String ordermethod) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
}
