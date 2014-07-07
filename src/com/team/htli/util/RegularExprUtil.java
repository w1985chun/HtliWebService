/**
 * <p>Title: RegularExprUtil.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date May 30, 2014
 * @version 1.0
 */
package com.team.htli.util;

import java.util.regex.Pattern;

/**
 * <p>
 * Title: RegularExprUtil
 * </p>
 * <p>
 * Description:正则表达式类
 * </p>
 * <p>
 * </p>
 * 
 * @author wangchun
 * @date May 30, 2014
 */
public class RegularExprUtil {

	public static boolean validUserName(String userName) {
		String patternStr = "[a-zA-Z][a-zA-Z0-9_]{5,19}";
		return Pattern.matches(patternStr, userName);
	}

	public static boolean validPassWD(String passWD) {
		String patternStr = "(\\w){6,20}";
		return Pattern.matches(patternStr, passWD);
	}

	public static boolean validRealName(String realName) {
		String patternStr = "[\u4e00-\u9fa5]{2,10}";
		return Pattern.matches(patternStr, realName);
	}

	public static boolean validPhone(String phone) {
		String patternStr = "(13[0-9]|15[012356789]|18[0-9]|14[57])[0-9]{8}";
		return Pattern.matches(patternStr, phone);
	}

	public static boolean validCarNo(String carNo) {
		String patternStr = "[\u4e00-\u9fa5_A-Z]{1}[A-Z]{1}[A-Z_0-9]{5}";
		return Pattern.matches(patternStr, carNo);
	}

	public static boolean validIDCard(String idCard) {
		String patternStr15 = "[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}";
		String patternStr18 = "[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{4}";
		return Pattern.matches(patternStr15, idCard)
				|| Pattern.matches(patternStr18, idCard);
	}

	public static void main(String[] args) {
		// System.out.println(validCarNo("CA88888"));
		// System.out.println(StringUtils.isNotEmpty("CA88888"));
	}

}
