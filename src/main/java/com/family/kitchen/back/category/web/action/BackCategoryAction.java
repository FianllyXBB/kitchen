package com.family.kitchen.back.category.web.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.family.kitchen.back.category.ao.CategoryAo;
import com.family.kitchen.back.category.po.Category;
import com.family.kitchen.back.category.service.BackCategoryService;
import com.family.kitchen.back.category.web.vo.CategoryVo;
import com.family.kitchen.util.PageSet;
import com.family.kitchen.util.UUIDUtil;

/**
 * 
 *<p>Title:BackCategoryAction.java</p>
 * @Package com.family.kitchen.back.category.web.action
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月27日 下午1:17:34
 */
@Controller
@RequestMapping("/backCategory")
public class BackCategoryAction {

	@Autowired
	private BackCategoryService backCategoryService;
	
	@RequestMapping("/categoryQuery.json")
	public @ResponseBody Object categoryQueryJson() throws IOException {
		CategoryVo categoryVo = new CategoryVo();
		PageSet<CategoryAo> pageData = backCategoryService.categoryQuery(categoryVo);
		JSONObject json = new JSONObject();
		json.put("pageData", pageData);
		return json;
	}
	
	@RequestMapping("/updateValidate.json")
	public @ResponseBody Object updateValidate(String categoryName, String categoryid) throws IOException {
		JSONObject json = new JSONObject();
		Map<String, String> errors = new HashMap<String, String>();
		if (categoryName == null || categoryName.trim().length() == 0) {
			errors.put("error", "类别名称不能为空");
		}else {
			CategoryAo categoryAo = backCategoryService.selectSingleCategory(categoryName);
			if (categoryAo != null) {
				errors.put("error", "类别已存在");
			}
		}
		if (errors != null && errors.size() > 0) {
			json.put("errors", errors);
			return json;
		}
		backCategoryService.updateCategory(categoryid,categoryName);
		json.put("errors", errors);
		return json;
	}
	
	@RequestMapping("/categoryQuery")
	public ModelAndView categoryQuery(@RequestParam(defaultValue="1") Integer pagenumber, @RequestParam(defaultValue="10") Integer pagesize,
			String ordercolumn, @RequestParam(defaultValue="asc") String ordermethod) throws IOException{
		CategoryVo categoryVo = new CategoryVo();
		categoryVo.setCurrentPage(pagenumber);
		categoryVo.setOrdercolumn(ordercolumn);
		categoryVo.setOrdermethod(ordermethod);
		categoryVo.setPagesize(pagesize);
		categoryVo.setStartrow((pagenumber-1)*pagesize);
		PageSet<CategoryAo> pageData = backCategoryService.categoryQuery(categoryVo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageData", pageData);
		modelAndView.setViewName("/back/categoryQuery");
		return modelAndView;
	}
	
	@RequestMapping("/beforeUpdateCategory")
	public ModelAndView beforeUpdateCategory(String categoryid) throws IOException{
		CategoryAo categoryAo = backCategoryService.selectSingleCategoryByPri(categoryid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("categoryAo", categoryAo);
		modelAndView.setViewName("/back/categoryDetail");
		return modelAndView;
	}
	
	@RequestMapping("/updateCategory")
	public void updateCategory(String categoryid, String categoryname) throws IOException{
		backCategoryService.updateCategory(categoryid, categoryname);;
	}
	
	@RequestMapping("/categoryAdd")
	public void categoryAdd(String categoryname) throws IOException {
		Category category = new Category();
		category.setCategoryname(categoryname);
		category.setCategoryid(UUIDUtil.randomUUID());
		backCategoryService.addCategory(category);
	}
	
	@RequestMapping("/beforeCategoryAdd")
	public ModelAndView beforeCategoryAdd(String categoryname) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/back/categoryAdd");
		return modelAndView;
	}
}
