package com.team.htli.util;

import java.util.List;

/**
 * @author wangchun
 * 
 * @param <T>
 */
public class CommonPagerData<T> {

	private Pager pager;
	private List<T> date;

	public CommonPagerData() {
		super();
	}

	public CommonPagerData(Pager pager, List<T> date) {
		super();
		this.pager = pager;
		this.date = date;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	/**
	 * @return the date
	 */
	public List<T> getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(List<T> date) {
		this.date = date;
	}

}
