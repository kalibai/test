package com.MY.mapper;

import java.util.List;
import java.util.Map;

import com.MY.pojo.Student;
import com.MY.utils.PageUtil;

/**
 * @author Teacher
 *	�����ࣺ���Զ�����󷽷�(ʵ�������Ҫǿ����д)����ͨ����
 *	�ӿ�����ķ�����ʡ���� public abstract 
 */
public interface StudentMapper {
	
	/**
	 * 手动写的查询接口
	 */
	Student selectStudentById(int id);
	/**
	 * 手动写的查询接口
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
