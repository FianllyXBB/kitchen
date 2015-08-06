package com.family.kitchen.combo.po;

import com.family.kitchen.base.BaseEntity;

public class Combo extends BaseEntity {
	
	private String comboid;
	private String comboname;
	private String comboimage;
	private String combodescription;
	private double comboprice;
	private int combonum;  // 总份数
	private int comborenum;//剩余份数
	private boolean show;
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
	public double getComboprice() {
		return comboprice;
	}
	public void setComboprice(double comboprice) {
		this.comboprice = comboprice;
	}
	public int getCombonum() {
		return combonum;
	}
	public void setCombonum(int combonum) {
		this.combonum = combonum;
	}
	public int getComborenum() {
		return comborenum;
	}
	public void setComborenum(int comborenum) {
		this.comborenum = comborenum;
	}
	public boolean getShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	
	
}
