package com.qianfeng.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.pojo.Student;
import com.qianfeng.utils.SqlSessionFactoryUtils;

public class TestMybatisDelete {
	public static void main(String[] args) {
		/*delete from tb_student where id=?*/
		Logger logger = Logger.getLogger(TestMybatisInsert.class);
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student();
		student.setId(14);
		mapper.deleteStudentById(student);
		sqlSession.commit();
	}
}
