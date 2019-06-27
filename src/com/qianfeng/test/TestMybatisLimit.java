package com.qianfeng.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.qianfeng.mapper.StudentMapper;
import com.qianfeng.pojo.Student;
import com.qianfeng.utils.PageUtil;
import com.qianfeng.utils.SqlSessionFactoryUtils;

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
