package com.qianfeng.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.pojo.Student;
import com.qianfeng.utils.SqlSessionFactoryUtils;

/**
 * @author Teacher
 *	自定义属性实现按某个字段排序
 */
public class TestMybatisOrderBy {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestMybatisOrderBy.class);
		SqlSession session = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Student student = new Student();
		//按照年龄排序
		student.setOrderByColumn("id");
		List<Student> list = mapper.queryOrderByColumn(student);
		System.out.println(list);
	}
	
}
