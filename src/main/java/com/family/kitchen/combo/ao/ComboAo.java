package com.family.kitchen.combo.ao;

import com.family.kitchen.combo.po.Combo;

public class ComboAo extends Combo {

	 private Integer pagenumber; //页码
	 private Integer pagesize; //一页大小
	 private String ordercolumn; //排序列
	 private String ordermethod;//排序方式
	 
	 private Integer minnum;//分页第一个数据
	 
	public Integer getPagenumber() {
		return pagenumber;
	}
	public void setPagenumber(Integer pagenumber) {
		this.pagenumber = pagenumber;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public String getOrdercolumn() {
		return ordercolumn;
	}
	public void setOrdercolumn(String ordercolumn) {
		this.ordercolumn = ordercolumn;
	}
	public String getOrdermethod() {
		return ordermethod;
	}
	public void setOrdermethod(String ordermethod) {
		this.ordermethod = ordermethod;
	}
	public Integer getMinnum() {
		return minnum;
	}
	public void setMinnum(Integer minnum) {
		this.minnum = minnum;
	}
	 
	 
}
