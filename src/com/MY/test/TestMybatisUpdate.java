package com.MY.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.MY.mapper.StudentMapper;
import com.MY.pojo.Student;
import com.MY.utils.SqlSessionFactoryUtils;

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
