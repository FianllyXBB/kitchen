package com.family.kitchen.back.combo.service;

import java.io.IOException;

import com.family.kitchen.back.combo.ao.BackComboAo;
import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.util.PageSet;

/**
 * 
 *<p>Title:BackComboService.java</p>
 * @Package com.family.kitchen.back.combo.service
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月12日 下午1:19:25
 */
public interface BackComboService {
	public PageSet<ComboAo> selectAll(Integer pagenumber, Integer pagesize, String ordercolumn, String ordermethod, String categoryid) throws IOException;

	public BackComboAo selectSingleComboByPri(String comboid) throws IOException;
}
