/**
 * <p>Title: CustomMySQLDialect.java</p>
 * <p>Description: </p>
 * @author wangchun
 * @date Mar 21, 2014
 * @version 1.0
 */
package com.team.htli.util;

import java.sql.Types;

import org.hibernate.Hibernate;
import org.hibernate.dialect.MySQLDialect;

/**
 * <p>
 * Title: CustomMySQLDialect
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 */
public class CustomMySQLDialect extends MySQLDialect {

	public CustomMySQLDialect() {
		super();
		registerHibernateType(Types.LONGVARCHAR, Hibernate.BIG_DECIMAL
				.getName());
	}

}
