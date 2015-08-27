package com.family.kitchen.back.category.web.vo;

import com.family.kitchen.back.category.ao.CategoryAo;
import com.family.kitchen.back.category.po.Category;

/**
 * 
 *<p>Title:CategoryVo.java</p>
 * @Package com.family.kitchen.back.category.web.action.vo
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月27日 下午1:25:20
 */
public class CategoryVo {
	private Category category;
	private CategoryAo categoryAo;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public CategoryAo getCategoryAo() {
		return categoryAo;
	}
	public void setCategoryAo(CategoryAo categoryAo) {
		this.categoryAo = categoryAo;
	}
	
}
