package com.family.kitchen.back.category.mapper;

import java.io.IOException;

import com.family.kitchen.back.category.po.Category;

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
	
}
