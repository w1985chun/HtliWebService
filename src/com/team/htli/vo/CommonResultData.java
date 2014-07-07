package com.team.htli.vo;

import java.io.Serializable;

public class CommonResultData<T> implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 4833255430721056908L;
	private int resultCode;
	private T data;

	public CommonResultData() {
		super();
	}

	public CommonResultData(int resultCode, T data) {
		super();
		this.resultCode = resultCode;
		this.data = data;
	}

	/**
	 * @return the resultCode
	 */
	public int getResultCode() {
		return resultCode;
	}

	/**
	 * @param resultCode
	 *            the resultCode to set
	 */
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

}
