package com.family.kitchen.back.category.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.kitchen.back.category.ao.CategoryAo;
import com.family.kitchen.back.category.mapper.BackCategoryMapper;
import com.family.kitchen.back.category.po.Category;
import com.family.kitchen.back.category.service.BackCategoryService;
import com.family.kitchen.back.category.web.vo.CategoryVo;
import com.family.kitchen.util.PageSet;

/**
 * 
 *<p>Title:CategoryServiceImpl.java</p>
 * @Package com.family.kitchen.back.category.service.impl
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月13日 上午11:33:52
 */
@Service("backCategoryService")
public class BackCategoryServiceImpl implements BackCategoryService {

	@Autowired
	private BackCategoryMapper backCategoryMapper;
	
	public void addCategory(Category category) throws IOException {
		backCategoryMapper.insertSingleCategory(category);
	}

	@Override
	public PageSet<CategoryAo> categoryQuery(CategoryVo categoryVo)
			throws IOException {
		List<CategoryAo> list = backCategoryMapper.selectAll(categoryVo);
		PageSet<CategoryAo> pageData = new PageSet<CategoryAo>();
		pageData.setCurrentPage(1);
		pageData.setTotalPageNum(1);
		pageData.setPageData(list);
		return pageData;
	}

	@Override
	public CategoryAo selectSingleCategory(String categoryname)
			throws IOException {
		CategoryVo categoryVo = new CategoryVo();
		Category category = new Category();
		category.setCategoryname(categoryname);
		categoryVo.setCategory(category);
		return backCategoryMapper.selectCategoryByName(categoryVo);
	}

	@Override
	public void updateCategory(String categoryid, String categoryname)
			throws IOException {
		CategoryVo categoryVo = new CategoryVo();
		Category category = new Category();
		category.setCategoryname(categoryname);
		category.setCategoryid(categoryid);
		categoryVo.setCategory(category);
		backCategoryMapper.updateCategory(categoryVo);
	}

	@Override
	public CategoryAo selectSingleCategoryByPri(String categoryid)
			throws IOException {
		return backCategoryMapper.selectSingleCategoryByPri(categoryid);
	}

}
