package com.family.kitchen.combo.web.action;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.service.ComboService;

/**
 * 
 * <p>Title: 基本套餐action类</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年8月7日 上午9:20:42 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年8月7日 上午9:20:42  XBB  Create
 * </pre>
 *
 */
@Controller
@RequestMapping("/combo")
public class ComboAction {

	@Autowired
	private ComboService comboService;
	
	@RequestMapping("/selectAll")
	public ModelAndView selectAll(@RequestParam(defaultValue="1") Integer pagenumber, @RequestParam(defaultValue="10") Integer pagesize,
			String ordercolumn, @RequestParam(defaultValue="asc") String ordermethod) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		List<ComboAo> list = comboService.selectAll(pagenumber, pagesize, ordercolumn, ordermethod);
		modelAndView.addObject("list", list);
		modelAndView.setViewName("/fore/combo/comboList");
		return modelAndView;
	}
	
}
