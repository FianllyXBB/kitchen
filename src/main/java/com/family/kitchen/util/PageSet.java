package com.family.kitchen.util;

import java.util.List;

/**
 * 
 *<p>Title:PageSet.java</p>
 * @Package com.family.kitchen.util
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月27日 上午10:54:11
 * @param <E>
 */
public class PageSet<E> {

	private Integer pagesize; //一页大小
	private String ordercolumn; //排序列
	private String ordermethod;//排序方式	
    private Integer startRow;//分页第一个数据
    private Integer endRow;//本页最后数据
    private String categoryid;//分页类别
    private Integer totalPageNum;//总共页数
    
    private List<E> pageData;

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

	public Integer getEndRow() {
		return endRow;
	}

	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public Integer getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public List<E> getPageData() {
		return pageData;
	}

	public void setPageData(List<E> pageData) {
		this.pageData = pageData;
	}
    
    
}
