package com.matpansoft.common.util;

import java.util.HashMap;

public class MatMap extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public MatMap() {
	}
	
	public int getInt(String key) {
		int num = 0;
		Object obj = get(key);
		if (obj != null) {
			String str = obj.toString().trim().replace(",", "");
			try {
				num = Integer.parseInt(str);
			} catch (NumberFormatException e) {
			}
		}
		return num;
	}
	
	public String getStr(String key) {
		String str = "";
		Object obj = get(key);
		if (obj != null) {
			str = obj.toString();
		}
		return str;
	}
}