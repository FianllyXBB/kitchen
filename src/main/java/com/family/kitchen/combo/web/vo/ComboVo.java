package com.family.kitchen.combo.web.vo;

import com.family.kitchen.base.BaseEntity;
import com.family.kitchen.combo.ao.ComboAo;

/**
 * 
 * <p>Title: 基本套餐包装类</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年8月7日 上午9:11:02 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年8月7日 上午9:11:02  XBB  Create
 * </pre>
 *
 */
public class ComboVo extends BaseEntity {
	
	private ComboAo comboAo;
	private Integer pagesize; //一页大小
	private String ordercolumn; //排序列
	private String ordermethod;//排序方式	
    private Integer minnum;//分页第一个数据
    private String categoryid;//分页类别
     
	public ComboAo getComboAo() {
		return comboAo;
	}
	public void setComboAo(ComboAo comboAo) {
		this.comboAo = comboAo;
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
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
		

	
}
