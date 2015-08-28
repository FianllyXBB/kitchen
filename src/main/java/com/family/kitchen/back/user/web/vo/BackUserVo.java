package com.family.kitchen.back.user.web.vo;

import com.family.kitchen.back.user.ao.BackUserAo;

/**
 * 
 *<p>Title:BackUserVo.java</p>
 * @Package com.family.kitchen.back.user.web.vo
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月28日 下午4:59:01
 */
public class BackUserVo {

	private BackUserAo backUserAo;
	private Integer pagesize; //一页大小
	private String ordercolumn; //排序列
	private String ordermethod;//排序方式	
    private Integer startRow;//分页第一个数据
	public BackUserAo getBackUserAo() {
		return backUserAo;
	}
	public void setBackUserAo(BackUserAo backUserAo) {
		this.backUserAo = backUserAo;
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
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
    
    
}
