package com.demo.diancan.util;

import java.util.List;

/**
 * 分页数据
 * 
 * @author youwenwu
 *
 */
public class PageResult<T> {
	/**
	 * 总记录数
	 */
	private int totalCount;
	/**
	 * 结果集
	 */
	private List<T> data;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
