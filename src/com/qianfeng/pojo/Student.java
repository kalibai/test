package com.qianfeng.pojo;

public class Student {
	/*
	 * mvc���ʱ���������Բ�Ҫ���û����������ͣ�ҪдΪ������������
	 * */
	private int id;
	private String username;
	private String num;
	private int age;
	private String dept;
	private String imgpath;
	/**
	 * �����ֶ�
	 * @return
	 */
	private String orderByColumn;
	public String getOrderByColumn() {
		return orderByColumn;
	}
	public void setOrderByColumn(String orderByColumn) {
		this.orderByColumn = orderByColumn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", num=" + num + ", age=" + age + ", dept=" + dept
				+ ", imgpath=" + imgpath + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String username, String num, int age, String dept, String imgpath) {
		super();
		this.username = username;
		this.num = num;
		this.age = age;
		this.dept = dept;
		this.imgpath = imgpath;
	}
	
}
