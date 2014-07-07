/**
 * <p>Title: PagingResultData.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date Jun 4, 2014
 * @version 1.0
 */
package com.team.htli.vo;

import java.util.List;

/**
 * <p>
 * Title: PagingResultData
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 * @date Jun 4, 2014
 */
public class PagingResultData<T> {

	private int totalData;
	private List<T> dataList;

	public PagingResultData() {
		super();
	}

	public PagingResultData(int totalData, List<T> dataList) {
		super();
		this.totalData = totalData;
		this.dataList = dataList;
	}

	public int getTotalData() {
		return totalData;
	}

	public void setTotalData(int totalData) {
		this.totalData = totalData;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

}
