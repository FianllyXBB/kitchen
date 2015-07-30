package com.family.kitchen.util;

import java.util.UUID;

public class UUIDUtil {

	public static String randomUUID() { 
		String[] uuids = UUID.randomUUID().toString().split("-");
		StringBuffer uuid = new StringBuffer();
		uuid.append(uuids[0]).append(uuids[1]).append(uuids[2]).append(uuids[3]).append(uuids[4]);
		return uuid.toString();
	}
}
