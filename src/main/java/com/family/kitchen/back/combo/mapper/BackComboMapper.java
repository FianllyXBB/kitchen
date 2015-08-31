package com.family.kitchen.back.combo.mapper;

import java.io.IOException;
import java.util.List;

import com.family.kitchen.back.combo.ao.BackComboAo;
import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.web.vo.ComboVo;
/**
 * 
 *<p>Title:BackComboMapper.java</p>
 * @Package com.family.kitchen.back.combo.mapper
 *<p>Description:TODO</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月12日 下午1:28:10
 */
public interface BackComboMapper {

	public List<ComboAo> selectAll(ComboVo comboVo) throws IOException;
	
	public Integer selectCount(ComboVo comboVo) throws IOException;

	public BackComboAo selectSingleComboByPri(String comboid) throws IOException;

}
