package com.qianfeng.mapper;

import java.util.List;
import java.util.Map;

import com.qianfeng.pojo.Student;
import com.qianfeng.utils.PageUtil;

/**
 * @author Teacher
 *	�����ࣺ���Զ�����󷽷�(ʵ�������Ҫǿ����д)����ͨ����
 *	�ӿ�����ķ�����ʡ���� public abstract 
 */
public interface StudentMapper {
	
	/**
	 * ����id��ѯѧ����Ϣ
	 */
	Student selectStudentById(int id);
	/**
	 * ����ѧ�������������ѯ
	 */
	Student getStudentByStudent(Student student);
	/**
	 * ��ѯ���е�ѧ������
	 */
	List<Student> getStudentList();
	/**
	 * ���ѧ����Ϣ
	 */
	void addStudent(Student student);
	/**
	 * ����id����ѧ����Ϣ
	 */
	void updateStudent(Student student);
	/**
	 * ����idɾ��ĳһ������
	 */
	void deleteStudentById(Student student);
	/**
	 * ����ɾ��
	 */
	void deleteBatch(int[] ids);
	/**
	 * ���ݴ����ֶ������ѯ
	 */
	List<Student> queryOrderByColumn(Student student);
	/**
	 * ��ҳ��ѯ
	 */
	List<Student> queryLimitObject(PageUtil pageUtil);
	/**
	 * ʹ��map��ҳ
	 */
	List<Student> queryLimitByMap(Map<String, Object> map);
	/**
	 * �ӿڶ�����ͨ����ʹ��default�ؼ���
	 */
//	public default void select() {
//	}
}
