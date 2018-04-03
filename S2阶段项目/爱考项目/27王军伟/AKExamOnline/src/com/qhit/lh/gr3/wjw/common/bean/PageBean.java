package com.qhit.lh.gr3.wjw.common.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王军伟 类说明：分页 创建时间:2018年1月7日下午7:05:23
 */
public class PageBean<T> {
	// 当前页
	private int currentIndex;
	// 每页记录数
	private int pageSize;
	// 总记录数
	private int totalNumber;
	// 总页数
	private int totalPage;
	// 下一页
	private int nextIndex;
	// 上一页
	private int preIndex;
	// 当前页的数据记录
	private List<T> Items;

	public PageBean(int totalNumber, int currentIndex, int pageSize, List<T> items) {
		this.totalNumber = totalNumber;
		this.currentIndex = currentIndex;
		this.pageSize = pageSize;
		this.Items = items;
	}

	public PageBean() {
		pageSize = 10;
		currentIndex = 1;
		Items = new ArrayList<>();
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	// 总页数
	public int getTotalPage() {
		int size = this.totalNumber / this.pageSize;
		if (this.totalNumber % this.pageSize != 0) {
			size = size + 1;
		}
		this.totalPage = size;

		return this.totalPage;
	}

	// 当前页的下一页，如果当前耶大于等于最后一页 那么下一页就是最后一页。
	public int getNextIndex() {

		if (this.currentIndex >= this.getTotalPage()) {
			this.nextIndex = this.currentIndex;
		} else {
			this.nextIndex = this.currentIndex + 1;
		}
		return nextIndex;
	}

	// 当前页的上一页，如果当前页小于第一页那么上一页为0
	public int getPreIndex() {

		if (this.currentIndex <= 1) {
			this.preIndex = 0;
		} else {
			this.preIndex = this.currentIndex - 1;
		}
		return preIndex;
	}

	public List<T> getItems() {
		return Items;
	}

	public void setItems(List<T> items) {
		Items = items;
	}
}