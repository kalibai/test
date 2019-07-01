package com.MY.test;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.MY.mapper.StudentMapper;
import com.MY.pojo.Student;
import com.MY.utils.SqlSessionFactoryUtils;

/**
 * @author Teacher
 *	�������
 */
public class TestMybatisInsert {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestMybatisInsert.class);
		Student student = new Student("�Ű���", "123123", 45, "�����ϵ", "img/2.jpg");
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		mapper.addStudent(student);
		//�ǵ��ύ����
		sqlSession.commit();
	}
}
