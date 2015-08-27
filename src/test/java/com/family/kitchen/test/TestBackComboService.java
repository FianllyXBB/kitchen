package com.family.kitchen.test;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.family.kitchen.back.combo.mapper.BackComboMapper;
import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.web.vo.ComboVo;
import com.family.kitchen.util.PageSet;

public class TestBackComboService {

	private ApplicationContext applicationContext;
	
	@Before
	public void createContext() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
	}
	
	@Test
	public void testSelectAlls() throws IOException {
		BackComboMapper backComboMapper = (BackComboMapper) applicationContext.getBean("backComboMapper");
		ComboVo comboVo = new ComboVo();
		comboVo.setCategoryid("9042f1bd3acd4edd86e538f0e29f7e6d");
		comboVo.setMinnum(0);
		comboVo.setOrdercolumn("comboprice");
		comboVo.setPagesize(8);
		Integer totalCount = backComboMapper.selectCount(comboVo);
		List<ComboAo> list = backComboMapper.selectAll(comboVo);
		PageSet<ComboAo> pageSet = new PageSet<ComboAo>();
		pageSet.setPageData(list);
		pageSet.setTotalPageNum(totalCount / 8);
	}
	
}
