package com.family.kitchen.back.combo.web.action;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.family.kitchen.back.category.ao.CategoryAo;
import com.family.kitchen.back.category.service.BackCategoryService;
import com.family.kitchen.back.category.web.vo.CategoryVo;
import com.family.kitchen.back.combo.ao.BackComboAo;
import com.family.kitchen.back.combo.po.BackCombo;
import com.family.kitchen.back.combo.service.BackComboService;
import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.util.PageSet;
import com.family.kitchen.util.UUIDUtil;

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
	@Autowired
	private BackCategoryService backCategoryService;
	
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
	
	@RequestMapping("/beforeAddCombo")
	public ModelAndView beforeAddCombo() throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		CategoryVo categoryVo = new CategoryVo();
		Integer categoryNum = backCategoryService.selectCounts(categoryVo);
		categoryVo.setStartrow(0);
		categoryVo.setPagesize(categoryNum);
		PageSet<CategoryAo> pageData = backCategoryService.categoryQuery(categoryVo);
		modelAndView.addObject("pageData", pageData);
		modelAndView.setViewName("/back/addCombo");
		return modelAndView;
	}
	
	@RequestMapping("/addCombo")
	public ModelAndView addCombo(String comboname, Double comboprice, String combodescription,
			Integer combonum, Integer comborenum, String categoryid, MultipartFile pic)throws Exception{
		ModelAndView modelAndView = new ModelAndView(); 
		BackCombo backCombo = new BackCombo();
		//原始文件名称
		String pictureFile_name =  pic.getOriginalFilename();
		//新文件名称
		String newFileName = UUIDUtil.randomUUID().toString()+pictureFile_name.substring(pictureFile_name.lastIndexOf("."));
		
		//上传图片
		File uploadPic = new java.io.File("E:/kitchenpic/"+newFileName);
		    
		if(!uploadPic.exists()){
			uploadPic.mkdirs();
		}
		//向磁盘写文件
		pic.transferTo(uploadPic);
		backCombo.setComboimage("/pic/"+newFileName);
		backCombo.setCategoryid(categoryid);
		backCombo.setCombodescription(combodescription);
		backCombo.setComboid(UUIDUtil.randomUUID());
		backCombo.setComboname(comboname);
		backCombo.setCombonum(combonum);
		backCombo.setComboprice(comboprice);
		backCombo.setComborenum(comborenum);
		backComboService.addCombo(backCombo);
		PageSet<ComboAo> pageData = backComboService.selectAll(1, 8, null, null, categoryid);
		pageData.setCurrentPage(1);
		modelAndView.addObject("pageData", pageData);
		modelAndView.setViewName("/back/comboQuery");
		return modelAndView;
	}
}
