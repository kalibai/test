package com.qianfeng.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.pojo.Student;
import com.qianfeng.utils.SqlSessionFactoryUtils;

/**
 * @author Teacher
 *	�Զ�������ʵ�ְ�ĳ���ֶ�����
 */
public class TestMybatisOrderBy {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestMybatisOrderBy.class);
		SqlSession session = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Student student = new Student();
		//������������
		student.setOrderByColumn("id");
		List<Student> list = mapper.queryOrderByColumn(student);
		System.out.println(list);
	}
	
}
