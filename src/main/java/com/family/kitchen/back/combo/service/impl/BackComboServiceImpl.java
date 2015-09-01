package com.family.kitchen.back.combo.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.kitchen.back.combo.ao.BackComboAo;
import com.family.kitchen.back.combo.mapper.BackComboMapper;
import com.family.kitchen.back.combo.po.BackCombo;
import com.family.kitchen.back.combo.service.BackComboService;
import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.web.vo.ComboVo;
import com.family.kitchen.util.PageSet;

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
	
	public PageSet<ComboAo> selectAll(Integer pagenumber, Integer pagesize,
			String ordercolumn, String ordermethod, String categoryid) throws IOException {
		PageSet<ComboAo> pageData = new PageSet<ComboAo>();
		ComboVo comboVo = new ComboVo();
		comboVo.setOrdercolumn(ordercolumn);
		pageData.setOrdercolumn(ordercolumn);
		comboVo.setOrdermethod(ordermethod);
		pageData.setOrdermethod(ordermethod);
		if (pagenumber != null && pagenumber > 0) {
			pageData.setStartRow((pagenumber-1)*pagesize);
			comboVo.setMinnum((pagenumber-1)*pagesize);
		}else {
			comboVo.setMinnum(0);
			pageData.setStartRow(0);
		}
		if (pagesize != null) {
			comboVo.setPagesize(pagesize);
			pageData.setPagesize(pagesize);
		}else {
			comboVo.setPagesize(10);
			pageData.setPagesize(10);
		}
		if (categoryid != null && categoryid.length() > 0) {
			comboVo.setCategoryid(categoryid);
			pageData.setCategoryid(categoryid);
		}
		Integer count = backComboMapper.selectCount(comboVo);
		pageData.setTotalPageNum(count%pageData.getPagesize()==0? count/pageData.getPagesize() : count/pageData.getPagesize() + 1);
		List<ComboAo> list = backComboMapper.selectAll(comboVo);
		pageData.setPageData(list);
		return pageData;
	}

	@Override
	public BackComboAo selectSingleComboByPri(String comboid) throws IOException {
		return backComboMapper.selectSingleComboByPri(comboid);
	}

	@Override
	public void addCombo(BackCombo backCombo) throws IOException {
		// TODO Auto-generated method stub
		backComboMapper.insertSingleCombo(backCombo);
	}

}
