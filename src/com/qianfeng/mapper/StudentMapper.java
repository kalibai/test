package com.qianfeng.mapper;

import java.util.List;
import java.util.Map;

import com.qianfeng.pojo.Student;
import com.qianfeng.utils.PageUtil;

/**
 * @author Teacher
 *	抽象类：可以定义抽象方法(实现类必须要强制重写)和普通方法
 *	接口里面的方法是省略了 public abstract 
 */
public interface StudentMapper {
	
	/**
	 * 根据id查询学生信息
	 */
	Student selectStudentById(int id);
	/**
	 * 根据学生姓名和年龄查询
	 */
	Student getStudentByStudent(Student student);
	/**
	 * 查询所有的学生对象
	 */
	List<Student> getStudentList();
	/**
	 * 添加学生信息
	 */
	void addStudent(Student student);
	/**
	 * 根据id更新学生信息
	 */
	void updateStudent(Student student);
	/**
	 * 根据id删除某一条数据
	 */
	void deleteStudentById(Student student);
	/**
	 * 批量删除
	 */
	void deleteBatch(int[] ids);
	/**
	 * 根据传入字段排序查询
	 */
	List<Student> queryOrderByColumn(Student student);
	/**
	 * 分页查询
	 */
	List<Student> queryLimitObject(PageUtil pageUtil);
	/**
	 * 使用map分页
	 */
	List<Student> queryLimitByMap(Map<String, Object> map);
	/**
	 * 接口定义普通方法使用default关键字
	 */
//	public default void select() {
//	}
}
