package com.qianfeng.utils;

public class PageUtil {
	/**
	 * 每一页起始地偏移量
	 */
	private int offset;
	/**
	 * 每一页的条数
	 */
	private int length;
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
