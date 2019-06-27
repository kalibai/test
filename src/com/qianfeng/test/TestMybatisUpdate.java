package com.qianfeng.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.pojo.Student;
import com.qianfeng.utils.SqlSessionFactoryUtils;

public class TestMybatisUpdate {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestMybatisUpdate.class);
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student("���ʵ", "123123", 45, "�����ϵ", "img/2.jpg");
		student.setId(20);
		mapper.updateStudent(student);
		//�ύ����
		sqlSession.commit();
	}
}
