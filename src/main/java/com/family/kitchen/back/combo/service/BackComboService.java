package com.family.kitchen.back.combo.service;

import java.io.IOException;
import java.util.List;

import com.family.kitchen.combo.ao.ComboAo;

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
	public List<ComboAo> selectAll(Integer pagenumber, Integer pagesize, String ordercolumn, String ordermethod) throws IOException;
}
