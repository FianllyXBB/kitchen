package com.family.kitchen.test;
import org.junit.Test;

import com.family.kitchen.util.UUIDUtil;

public class TestUserMapper {

	@Test
	public void testUUID(){
		String uuid = UUIDUtil.randomUUID();
		System.out.println(uuid + "  " + uuid.length());
	}
}
