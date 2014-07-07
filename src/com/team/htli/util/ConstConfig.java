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
	
}
