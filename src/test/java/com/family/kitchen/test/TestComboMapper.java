package com.family.kitchen.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.family.kitchen.combo.ao.ComboAo;
import com.family.kitchen.combo.po.Combo;
import com.family.kitchen.combo.service.ComboService;
import com.family.kitchen.util.UUIDUtil;

public class TestComboMapper {

	private ApplicationContext applicationContext;
	
	@Before
	public void createContext() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
	}
	
	@Test
	public void insertcomboList() throws IOException {
		ComboService comboService = (ComboService) applicationContext.getBean("comboService");
		List<Combo> list = new ArrayList<Combo>();
		for (int i = 1; i < 100; i++) {
			Combo combo = new Combo();
			combo.setComboid(UUIDUtil.randomUUID());
			combo.setComboname(""+i);
			combo.setComboimage("images/01.jpg");
			combo.setCombodescription("非常好吃奥");
			combo.setComboprice(i+0d);
			combo.setCombonum(10);
			combo.setComborenum(5);
			list.add(combo);
		}	
		comboService.insertComboList(list);
	}

	@Test
	public void testSelectAll() throws IOException {
		ComboService comboService = (ComboService) applicationContext.getBean("comboService");
		List<ComboAo> list = comboService.selectAll(1, 9, "comboprice", "desc");	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getComboprice());
		}
	}
}
