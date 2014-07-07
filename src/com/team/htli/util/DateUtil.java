package com.team.htli.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String dateToString(Date time) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(time);
	}

	public static Date stringToDate(String format, String dateStr)
			throws ParseException {
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat(format);
		return formatter.parse(dateStr);
	}

}
