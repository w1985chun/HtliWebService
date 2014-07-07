package com.team.htli.vo;

import java.io.Serializable;

public class SimpleResult implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 4833255430721056908L;
	private int resultCode;

	public SimpleResult() {
		super();
	}

	public SimpleResult(int resultCode) {
		super();
		this.resultCode = resultCode;
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

}
