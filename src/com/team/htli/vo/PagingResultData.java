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

	private int totalCount;
	private List<T> dataList;

	public PagingResultData() {
		super();
	}

	public PagingResultData(int totalCount, List<T> dataList) {
		super();
		this.totalCount = totalCount;
		this.dataList = dataList;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

}
