package com.family.kitchen.combo.mapper;

import java.io.IOException;
import java.util.List;

import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.web.vo.ComboVo;

public interface ComboMapper {

	public List<ComboVo> selectAll(ComboAo comboAo) throws IOException;

}
