package com.family.kitchen.util;
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 翻页标签
 *<p>Title:Page.java</p>
 * @Package com.family.kitchen.util
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月31日 上午10:51:30
 */
public class Page extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	private Integer currentPage;
	private Integer totalPageNum;
	private Integer pagesize;
	private String url;
	private String ordercolumn; //排序列
	private String ordermethod;//排序方式	
    private String categoryid;//分页类别
	
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*
	<nav>
		<ul class="pagination">
			<c:if test="${pageData.totalPageNum == 1 }">
				<li class="active"><a href="">1 <span class="sr-only">(current)</span></a></li>
			</c:if>
			<c:if test="${pagaData.totalPageNum > 1 and pageData.totalPageNum <= 14 }">
				<li class="disabled"><a href="#" data-aria-label="Previous"><span data-aria-hidden="true">&laquo;</span></a></li>
				<li class="active"><a href="/kitchen/backmain/comboQuery.ms?pagesize=8&pagenumber=1">1 <span class="sr-only">(current)</span></a></li>
				<c:forEach begin="2" end="${pageData.totalPageNum }">
					<li><a href="#">${varStatus.index } <span class="sr-only">(current)</span></a></li>
				</c:forEach>
				
			</c:if>
	    <li class="disabled"><a href="#" data-aria-label="Previous"><span data-aria-hidden="true">&laquo;</span></a></li>
	    <li class="active"><a href="/kitchen/backmain/comboQuery.ms?pagesize=8&pagenumber=1">1 <span class="sr-only">(current)</span></a></li>
	    <li><a href="/kitchen/backmain/comboQuery.ms?pagesize=8&pagenumber=2">2<span class="sr-only">(current)</span></a></li>
	    <li><a href="#">1 <span class="sr-only">(current)</span></a></li>
	    <li><a href="#">1 <span class="sr-only">(current)</span></a></li>
	    <li><label style="text-align: center;font-size: 20px;">共10页</label></li>
	    <li><a href="#" data-aria-label="Next"><span data-aria-hidden="true">&raquo;</span></a></li>
	    
		</ul>
		
	</nav>
	*/
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = super.pageContext.getOut();
		Integer begin = 0;
		Integer end = 0;
		String criteria = "?pagesize=" + pagesize + "&ordercolumn=" + ordercolumn + "&ordermethod=" + ordermethod + "&categoryid=" + categoryid + "&pagenumber=";
		if (totalPageNum <= 10) {
			begin = 1;
			end = totalPageNum;
		}else {
			begin = currentPage - 5;
		}
		if (begin < 1) {
			begin = 1;
		}
		end = begin + 9;
		if (end > totalPageNum) {
			end = totalPageNum;
		}
		try {			
			if (currentPage == 1) {
				out.println("<nav><ul class='pagination'><li class='disabled'><a data-aria-label='Previous'><span data-aria-hidden='true'>&laquo;</span></a></li>");
			}else {
				out.println("<nav><ul class='pagination'><li><a href='" + url + criteria + (currentPage-1) + "' data-aria-label='Previous'><span data-aria-hidden='true'>&laquo;</span></a></li>");
			}
			for (int i = begin; i <= end; i++) {
				if (i == currentPage) {
					out.println("<li class='active'><a>"+ i +"<span class='sr-only'>(current)</span></a></li>");
				}else {
					out.println("<li><a href='" + url + criteria + i + "'>"+ i +"<span class='sr-only'>(current)</span></a></li>");
				}
			}
			if (currentPage == totalPageNum) {
				out.println("<li class='disabled'><a data-aria-label='Next'><span data-aria-hidden='true'>&raquo;</span></a></li>");
			}else {
				out.println("<li><a href='" + url + criteria + (currentPage+1) + "' data-aria-label='Next'><span data-aria-hidden='true'>&raquo;</span></a></li>");
			}
			out.println("<li><label style='text-align: center;font-size: 20px;'>"+ "第" + currentPage + "页/" +"共" + totalPageNum + "页</label></li></ul></nav>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return TagSupport.SKIP_BODY;
	}
	
}
