package com.family.kitchen.back.category.po;

/**
 * 
 *<p>Title:Category.java</p>
 * @Package com.family.kitchen.back.category.po
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月13日 上午11:22:57
 */
public class Category {

	private String categoryid;
	private String categoryname;
	private Boolean show;
	
	public Boolean getShow() {
		return show;
	}
	public void setShow(Boolean show) {
		this.show = show;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
}
