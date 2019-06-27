package com.qianfeng.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.pojo.Student;

public class TestMybatis2 {
	public static void main(String[] args) {
		//�����ܷ񴴽���sqlsessionfactory
		//��ȡmybatis�ĺ������õ�λ��
		String resource = "resources/mybatis-config.xml";
		try {
			InputStream input = Resources.getResourceAsStream(resource);
			//ͨ��sqlsessionfactoryBuilderȥ��������
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
			SqlSession session = sqlSessionFactory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			Student student = new Student();
			//查找指定studentֵ
			student.setAge(21);
			student.setUsername("vvvv");
			Student studentNew = mapper.getStudentByStudent(student);
			System.out.println(studentNew);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
