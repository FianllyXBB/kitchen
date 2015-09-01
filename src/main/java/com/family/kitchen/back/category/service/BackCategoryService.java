package com.family.kitchen.back.category.service;

import java.io.IOException;

import com.family.kitchen.back.category.ao.CategoryAo;
import com.family.kitchen.back.category.po.Category;
import com.family.kitchen.back.category.web.vo.CategoryVo;
import com.family.kitchen.util.PageSet;

/**
 * 
 *<p>Title:CategoryService.java</p>
 * @Package com.family.kitchen.back.category.service
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月13日 上午11:31:16
 */
public interface BackCategoryService {
	
	public void addCategory(Category category) throws IOException;

	public PageSet<CategoryAo> categoryQuery(CategoryVo categoryVo) throws IOException;

	public CategoryAo selectSingleCategory(String categoryName) throws IOException;

	public void updateCategory(String categoryid, String categoryName) throws IOException;

	public CategoryAo selectSingleCategoryByPri(String categoryid) throws IOException;
	
	public Integer selectCounts(CategoryVo categoryVo) throws IOException;
}
