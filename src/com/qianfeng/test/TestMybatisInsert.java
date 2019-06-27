package com.qianfeng.test;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.pojo.Student;
import com.qianfeng.utils.SqlSessionFactoryUtils;

/**
 * @author Teacher
 *	添加数据
 */
public class TestMybatisInsert {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestMybatisInsert.class);
		Student student = new Student("张爱岗", "123123", 45, "计算机系", "img/2.jpg");
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		mapper.addStudent(student);
		//记得提交事务
		sqlSession.commit();
	}
}
