package com.team.htli.controller;

/**
 * <p>Title: BaseDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date Mar 18, 2014
 * @version 1.0
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.team.htli.util.ConstConfig;

/**
 * 
 * <p>
 * Title: BaseController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 * @date Mar 18, 2014
 */
@Controller
public abstract class BaseController {

	@SuppressWarnings("unused")
	private Logger log = Logger.getLogger(this.getClass());

	/**
	 * 转换obj对象为map
	 * 
	 * @param map
	 *            输出的map
	 * @param obj
	 *            被转换的obj,JavaBean转换为Map，Map添加进结果Map
	 * @return 转换好的map
	 */
	@SuppressWarnings( { "unused", "unchecked" })
	private Map<String, Object> beanToMap(Map<String, Object> map, Object obj) {
		if (null == obj && null == map) {
			return map;
		}
		// 判断如果是Map直接存入结果Map返回
		if (obj instanceof Map) {
			for (Iterator it = ((Map) obj).entrySet().iterator(); it.hasNext();) {
				Map.Entry e = (Map.Entry) it.next();
				map.put(e.getKey().toString(), e.getValue());
			}
		} else {
			Field[] fields = obj.getClass().getDeclaredFields();
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if (null != field.get(obj)) {
						map.put(field.getName(), field.get(obj));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return map;
	}

	/**
	 * javaBean 与数据库字段互转
	 * 
	 * @param str
	 * @return
	 */
	@SuppressWarnings("unused")
	private String upperToLower(String str) {

		if (str == null || str.indexOf("_") != -1) {
			return str;
		}

		char[] c = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0, n = c.length; i < n; i++) {
			if (Character.isUpperCase(c[i])) {
				sb.append("_");
				sb.append(Character.toLowerCase(c[i]));
			} else {
				sb.append(c[i]);
			}
		}
		return sb.toString();
	}

	/**
	 * 
	 * @param response
	 * @param jsonObject
	 * @throws IOException
	 */
	public void retJson(HttpServletResponse response, JSONObject jsonObject)
			throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/Xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jsonObject.toString());
	}

	public void setMenuFlag(ModelMap modelMap, int flag) {
		modelMap.addAttribute("menuFlag", flag);
	}

	public ModelMap getModelMap() {
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute(ConstConfig.ResultKey.RESULT_KEY,
				ConstConfig.GlobalResultCode.ERROR_SYS);
		return modelMap;
	}

}
