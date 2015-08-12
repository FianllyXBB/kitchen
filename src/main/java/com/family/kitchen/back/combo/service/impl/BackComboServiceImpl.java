package com.family.kitchen.back.combo.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.kitchen.back.combo.mapper.BackComboMapper;
import com.family.kitchen.back.combo.service.BackComboService;
import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.web.vo.ComboVo;

/**
 * 
 *<p>Title:BackComboServiceImpl.java</p>
 * @Package com.family.kitchen.back.combo.service
 *<p>Description:</p>
 *<p>Copyright:</p>
 *<p>Company:</p>
 * @author XBB
 * @version 1.0
 * @date 2015年8月12日 下午1:21:34
 */
@Service("backComboService")
public class BackComboServiceImpl implements BackComboService {

	@Autowired
	private BackComboMapper backComboMapper;
	
	public List<ComboAo> selectAll(Integer pagenumber, Integer pagesize,
			String ordercolumn, String ordermethod) throws IOException {
		ComboVo comboVo = new ComboVo();
		comboVo.setOrdercolumn(ordercolumn);
		comboVo.setOrdermethod(ordermethod);
		if (pagenumber != null && pagenumber > 0) {
			comboVo.setMinnum((pagenumber-1)*pagesize);
		}else {
			comboVo.setMinnum(0);
		}
		if (pagesize != null) {
			comboVo.setPagesize(pagesize);
		}else {
			comboVo.setPagesize(backComboMapper.selectCount());
		}
		
		List<ComboAo> list = backComboMapper.selectAll(comboVo);
		return list;
	}

}
