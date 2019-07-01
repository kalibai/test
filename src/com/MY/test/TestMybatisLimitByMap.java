package com.MY.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.MY.mapper.StudentMapper;
import com.MY.pojo.Student;
import com.MY.utils.SqlSessionFactoryUtils;

/**
 * @author Teacher
 *	ʹ��map��Ϊsql�����
 */
public class TestMybatisLimitByMap {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestMybatisLimitByMap.class);
		SqlSession session = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Map<String, Object> map = new HashMap<>();
		map.put("offset", 1);
		map.put("length", 3);
		List<Student> list = mapper.queryLimitByMap(map);
		System.out.println(list);
	}
}
