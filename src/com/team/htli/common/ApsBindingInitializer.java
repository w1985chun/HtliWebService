/**
 * <p>Title: BaseDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: www.teleframe.cn</p>
 * @author wangchun
 * @date Mar 18, 2014
 * @version 1.0
 */
package com.team.htli.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * 
 * <p>
 * Title: ApsBindingInitializer
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.teleframe.cn
 * </p>
 * 
 * @author wangchun
 * @date Mar 18, 2014
 */
public class ApsBindingInitializer implements WebBindingInitializer {

	public void initBinder(WebDataBinder binder, WebRequest request) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
		binder.registerCustomEditor(String.class,
				new StringTrimmerEditor(false));
	}

}
