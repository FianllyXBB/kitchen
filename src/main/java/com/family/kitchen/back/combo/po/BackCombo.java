package com.family.kitchen.back.combo.po;

import com.family.kitchen.base.BaseEntity;

/**
 * 
 *<p>Title:BackCombo.java</p>
 * @Package com.family.kitchen.back.combo.po
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月31日 下午4:39:19
 */
public class BackCombo extends BaseEntity {

	private String comboid;
	private String comboname;
	private String comboimage;
	private String combodescription;
	private Double comboprice;
	private Integer combonum;  // 总份数
	private Integer comborenum;//剩余份数
	private Boolean show;
	private String categoryid;
	
	public String getComboid() {
		return comboid;
	}
	public void setComboid(String comboid) {
		this.comboid = comboid;
	}
	public String getComboname() {
		return comboname;
	}
	public void setComboname(String comboname) {
		this.comboname = comboname;
	}
	public String getComboimage() {
		return comboimage;
	}
	public void setComboimage(String comboimage) {
		this.comboimage = comboimage;
	}
	public String getCombodescription() {
		return combodescription;
	}
	public void setCombodescription(String combodescription) {
		this.combodescription = combodescription;
	}
	public Double getComboprice() {
		return comboprice;
	}
	public void setComboprice(Double comboprice) {
		this.comboprice = comboprice;
	}
	public Integer getCombonum() {
		return combonum;
	}
	public void setCombonum(Integer combonum) {
		this.combonum = combonum;
	}
	public Integer getComborenum() {
		return comborenum;
	}
	public void setComborenum(Integer comborenum) {
		this.comborenum = comborenum;
	}
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
}
