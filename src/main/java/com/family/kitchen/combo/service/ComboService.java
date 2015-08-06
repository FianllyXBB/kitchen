package com.family.kitchen.combo.service;

import java.io.IOException;
import java.util.List;

import com.family.kitchen.combo.web.vo.ComboVo;

public interface ComboService {

	public List<ComboVo> selectAll(Integer pagenumber, Integer pagesize, String ordercolumn, String ordermethod) throws IOException;

}
