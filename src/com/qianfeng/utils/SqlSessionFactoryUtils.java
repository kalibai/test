package com.qianfeng.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.Messaging.SyncScopeHelper;

/**
 * @author Teacher
 *	sqlsessionfactory��ȡsession
 *	sqlsessionfactoryʹ�õ��ǵ���ģʽ(ֻ��һ��)
 */
public class SqlSessionFactoryUtils {
	private static SqlSessionFactory sqlSessionFactory;
	//����
	private static Class<SqlSessionFactoryUtils> lock = SqlSessionFactoryUtils.class;
	/**
	 * ���췽��˽�л�
	 */
	private SqlSessionFactoryUtils() {};
	
	/**
	 * ��ȡsqlSessionFactory  ,����ģʽ
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		synchronized(lock) {//线程锁
			if(sqlSessionFactory!=null) {
				return sqlSessionFactory;
			}
			try {
				InputStream input = Resources.getResourceAsStream("resources/mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return sqlSessionFactory;
		}
	}
	/**
	 * ���sqlsession
	 */
	public static SqlSession getSqlSession() {
		if(sqlSessionFactory==null) {
			getSqlSessionFactory();
		}
		return sqlSessionFactory.openSession();
	}
}
