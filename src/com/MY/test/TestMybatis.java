package com.MY.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.MY.mapper.StudentMapper;
import com.MY.pojo.Student;

/**
 * @author Teacher
 *	mybatis�����ݿ�Ĳ���ȫ�����ǻ���sqlsession�Ĳ���
 *	user_name useName user_age userAge
 */
public class TestMybatis {
	public static void main(String[] args) {
		//�����ܷ񴴽���sqlsessionfactory
		//��ȡmybatis�ĺ������õ�λ��
		String resource = "resources/mybatis-config.xml";
		try {
			InputStream input = Resources.getResourceAsStream(resource);
			//ͨsqlsessionfactoryBuilder
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
			//sqlsesison
			SqlSession sqlSession = sqlSessionFactory.openSession();
			//ʹ��sqlSession����mapper
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			//ִ�в�ѯ����
			Student student = mapper.selectStudentById(5);
			System.out.println(student);
			//���Բ�ѯ���е�ѧ��
//			List<Student> studentList = mapper.getStudentList();
//			System.out.println(studentList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
