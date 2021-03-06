/**
 * 
 */
package com.team.htli.util;

/**
 * @author wangchun
 * 
 */
public class ConstConfig {

	public interface ResultKey {
		public static final String RESULT_KEY = "resultCode";
	}

	public interface RequestParamKey {
		public static final String KEY_TOKEN = "token";
		public static final String KEY_USER_ID = "userId";
	}

	public interface GlobalResultCode {
		public static final int ERROR_SYS = -500;
		public static final int SUC = 1;
	}

	public interface InfoType {
		public static final String WORLD = "world";// 1：world达观天下
		public static final String ESTATE = "estate";// 2：estate物业信息
		public static final String PRODUCT = "product";// 3：product群英汇
		public static final String SHOP = "shop";// 4：shop认证商城
	}
}
