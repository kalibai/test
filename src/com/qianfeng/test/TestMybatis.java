package com.qianfeng.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.pojo.Student;

/**
 * @author Teacher
 *	mybatis对数据库的操作全部都是基于sqlsession的操作
 *	user_name useName user_age userAge
 */
public class TestMybatis {
	public static void main(String[] args) {
		//测试能否创建出sqlsessionfactory
		//获取mybatis的核心配置的位置
		String resource = "resources/mybatis-config.xml";
		try {
			InputStream input = Resources.getResourceAsStream(resource);
			//通过sqlsessionfactoryBuilder去创建工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
			//获取sqlsesison
			SqlSession sqlSession = sqlSessionFactory.openSession();
			//使用sqlSession加载mapper
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			//执行查询操作
			Student student = mapper.selectStudentById(5);
			System.out.println(student);
			//测试查询所有的学生
//			List<Student> studentList = mapper.getStudentList();
//			System.out.println(studentList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
