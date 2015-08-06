package com.family.kitchen.combo.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.mapper.ComboMapper;
import com.family.kitchen.combo.service.ComboService;
import com.family.kitchen.combo.web.vo.ComboVo;

@Service("comboService")
public class ComboServiceImpl implements ComboService {

	@Autowired
	private ComboMapper comboMapper;
	
	public List<ComboVo> selectAll(Integer pagenumber, Integer pagesize,
			String ordercolumn, String ordermethod) throws IOException {
		ComboAo comboAo = new ComboAo();
		comboAo.setOrdercolumn(ordercolumn);
		comboAo.setOrdermethod(ordermethod);
		comboAo.setMinnum((pagenumber-1)*pagesize);;
		comboAo.setPagesize(pagesize);
		List<ComboVo> list = comboMapper.selectAll(comboAo);
		return list;
	}

}
