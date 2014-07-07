/**
 * <p>Title: ApplicationGlobalData.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: www.teleframe.cn</p>
 * @author wangchun
 * @date Jun 10, 2014
 * @version 1.0
 */
package com.team.htli.util;


/**
 * <p>
 * Title: ApplicationGlobalData
 * </p>
 * <p>
 * Description:存放全局数据
 * </p>
 * 
 * @author wangchun
 * @date Jun 10, 2014
 */
public class ApplicationGlobalData {

	private static ApplicationGlobalData instance;

	private ApplicationGlobalData() {
	}

	public static ApplicationGlobalData getInstance() {
		if (instance == null) {
			instance = new ApplicationGlobalData();
		}
		return instance;
	}
}
