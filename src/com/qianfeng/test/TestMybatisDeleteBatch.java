package com.qianfeng.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.utils.SqlSessionFactoryUtils;

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
