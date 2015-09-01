package com.family.kitchen.back.category.mapper;

import java.io.IOException;
import java.util.List;

import com.family.kitchen.back.category.ao.CategoryAo;
import com.family.kitchen.back.category.po.Category;
import com.family.kitchen.back.category.web.vo.CategoryVo;

/**
 * 
 *<p>Title:CategoryMapper.java</p>
 * @Package com.family.kitchen.back.category.mapper
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月13日 上午11:14:44
 */
public interface BackCategoryMapper {

	public void insertSingleCategory(Category category) throws IOException;

	public List<CategoryAo> selectAll(CategoryVo categoryVo) throws IOException;

	public CategoryAo selectCategoryByName(CategoryVo categoryVo) throws IOException;

	public void updateCategory(CategoryVo categoryVo) throws IOException;

	public CategoryAo selectSingleCategoryByPri(String categoryid) throws IOException;
	
	public Integer selectCounts(CategoryVo categoryVo) throws IOException;

}
