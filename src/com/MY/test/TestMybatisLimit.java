package com.MY.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.MY.mapper.StudentMapper;
import com.MY.pojo.Student;
import com.MY.utils.PageUtil;
import com.MY.utils.SqlSessionFactoryUtils;

/**
 * @author Teacher
 *	�Զ������ҳ��ѯ
 */
public class TestMybatisLimit {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestMybatisLimit.class);
		SqlSession session = SqlSessionFactoryUtils.getSqlSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		//����ҳ���������ֵ
		PageUtil pageUtil = new PageUtil();
		pageUtil.setOffset(1);
		pageUtil.setLength(4);
		List<Student> list = mapper.queryLimitObject(pageUtil);
		System.out.println(list);
	}
}
