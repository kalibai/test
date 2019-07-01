package com.MY.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.MY.mapper.StudentMapper;
import com.MY.utils.SqlSessionFactoryUtils;

public class TestMybatisDeleteBatch {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestMybatisDeleteBatch.class);
		SqlSession session = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		int [] ids = {11,12,15};
		mapper.deleteBatch(ids);
		session.commit();
	}
}
