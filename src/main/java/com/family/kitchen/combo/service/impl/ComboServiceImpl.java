package com.family.kitchen.combo.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.mapper.ComboMapper;
import com.family.kitchen.combo.po.Combo;
import com.family.kitchen.combo.service.ComboService;
import com.family.kitchen.combo.web.vo.ComboVo;

/**
 * 
 * <p>Title: Combo service</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年8月7日 上午9:23:48 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年8月7日 上午9:23:48  XBB  Create
 * </pre>
 *
 */
@Service("comboService")
public class ComboServiceImpl implements ComboService {

	@Autowired
	private ComboMapper comboMapper;
	
	public List<ComboAo> selectAll(Integer pagenumber, Integer pagesize,
			String ordercolumn, String ordermethod) throws IOException {
		ComboVo comboVo = new ComboVo();
		comboVo.setOrdercolumn(ordercolumn);
		comboVo.setOrdermethod(ordermethod);
		if (pagenumber != null) {
			comboVo.setMinnum((pagenumber-1)*pagesize);
		}else {
			comboVo.setMinnum(0);
		}
		if (pagesize != null) {
			comboVo.setPagesize(pagesize);
		}else {
			comboVo.setPagesize(comboMapper.selectCount());
		}
		
		List<ComboAo> list = comboMapper.selectAll(comboVo);
		return list;
	}

	public void insertComboList(List<Combo> list) throws IOException {
		comboMapper.insertComboList(list);	
	}

	public Integer selectCount() throws IOException {
		return comboMapper.selectCount();
	}
	
	

}
