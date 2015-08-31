package com.family.kitchen.back.user.web.action;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.back.user.ao.BackUserAo;
import com.family.kitchen.back.user.service.BackUserService;
import com.family.kitchen.back.user.web.vo.BackUserVo;
import com.family.kitchen.util.PageSet;

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
			String ordercolumn, @RequestParam(defaultValue="asc") String ordermethod, String username) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		BackUserAo backUserAo = new BackUserAo();
		backUserAo.setUsername(username);
		BackUserVo backUserVo = new BackUserVo();
		backUserVo.setOrdercolumn(ordercolumn);
		backUserVo.setOrdermethod(ordermethod);
		backUserVo.setPagesize(pagesize);
		backUserVo.setStartRow(pagesize*(pagenumber-1));
		backUserVo.setBackUserAo(backUserAo);
		PageSet<BackUserAo> pageData = new PageSet<BackUserAo>();
		pageData = backUserService.selectAll(backUserVo);
		pageData.setCurrentPage(pagenumber);
		modelAndView.addObject("pageData", pageData);
		modelAndView.setViewName("/back/usersQuery");
		return modelAndView;
	}
}
