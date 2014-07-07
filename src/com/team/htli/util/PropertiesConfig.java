package com.team.htli.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesConfig {

	private static ResourceBundle resource;

	static {
		resource = ResourceBundle.getBundle("config", Locale.CHINA);
	}

	/**
	 * 私有构造方法，不需要创建对象
	 */
	private PropertiesConfig() {
	}

	public static String getParamValue(String key) {
		return resource.getString(key);
	}
}
