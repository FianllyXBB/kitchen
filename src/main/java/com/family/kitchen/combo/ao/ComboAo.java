package com.family.kitchen.combo.ao;

import com.family.kitchen.base.BaseEntity;

/**
 * 
 * <p>Title: 基本套餐扩展类</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年8月7日 上午9:08:51 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年8月7日 上午9:08:51  XBB  Create
 * </pre>
 *
 */
public class ComboAo extends BaseEntity{	 
	private String comboid;
	private String comboname;
	private String comboimage;
	private String combodescription;
	private Double comboprice;
	private Integer combonum;  // 总份数
	private Integer comborenum;//剩余份数
	private Boolean show;
	private String categoryid;
	
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
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
}
