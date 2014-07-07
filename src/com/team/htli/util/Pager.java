package com.team.htli.util;

/**
 * 分页
 * 
 * @author wangchun
 * 
 */
public class Pager {

	private long total_page; // 总页数
	private long total_count; // 总记录数
	private long current_page; // 当前页
	private long page_size; // 每页的数量
	private long first_page;
	private long pre_page;
	private long next_page;
	private long last_page;
	private boolean is_first;
	private boolean is_last;

	public long getTotal_page() {
		return total_page;
	}

	public void setTotal_page(int total_page) {
		this.total_page = total_page;
	}

	public Long getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Long total_count) {
		this.total_count = total_count;
	}

	public long getCurrent_page() {
		return current_page;
	}

	public void setCurrent_page(long current_page) {
		this.current_page = current_page;
	}

	public long getPage_size() {
		return page_size;
	}

	public void setPage_size(long page_size) {
		this.page_size = page_size;
	}

	public long getFirst_page() {
		return first_page;
	}

	public void setFirst_page(long first_page) {
		this.first_page = first_page;
	}

	public long getPre_page() {
		return pre_page;
	}

	public void setPre_page(long pre_page) {
		this.pre_page = pre_page;
	}

	public long getNext_page() {
		return next_page;
	}

	public void setNext_page(long next_page) {
		this.next_page = next_page;
	}

	public long getLast_page() {
		return last_page;
	}

	public void setLast_page(long last_page) {
		this.last_page = last_page;
	}

	public boolean isIs_first() {
		return is_first;
	}

	public void setIs_first(boolean is_first) {
		this.is_first = is_first;
	}

	public boolean isIs_last() {
		return is_last;
	}

	public void setIs_last(boolean is_last) {
		this.is_last = is_last;
	}

	public Pager() {
		super();
	}

	/**
	 * 分页处理
	 * 
	 * @param current_page
	 *            当前页
	 * @param page_size
	 *            每页的数量
	 * @param total_count
	 *            总记录数
	 */
	public Pager(long current_page, int page_size, long total_count) {
		this.current_page = current_page;
		this.page_size = page_size;
		this.total_count = total_count;

		if (current_page < 1) {
			this.current_page = 1;
		}

		this.total_page = (this.total_count + page_size - 1) / page_size;
		this.first_page = 1;
		this.last_page = total_page;

		if (this.current_page > 1) {
			this.pre_page = this.current_page - 1;
		} else {
			this.pre_page = 1;
		}

		if (this.current_page < total_page) {
			this.next_page = this.current_page + 1;
		} else {
			this.next_page = total_page;
		}

		if (this.current_page <= 1) {
			this.is_first = true;
		} else {
			this.is_first = false;
		}

		if (this.current_page >= total_page) {
			this.is_last = true;
		} else {
			this.is_last = false;
		}

		if (this.current_page > total_page) {
			this.current_page = 1;
		}
	}

}
