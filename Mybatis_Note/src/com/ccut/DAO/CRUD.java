package com.ccut.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ccut.domain.Student;


public interface CRUD {

	@Select("select * from student where id = #{id}")
	public Student selectDATA(int id);
	
	@Insert("insert into student(id,name,sex) values(#{id},#{name},#{sex})")
	public void insertDATA(Student student);
	
	@Update("update student set name = #{name}, sex = #{sex} where id = #{id}")
	public void updataDATA(Student student);
	
	@Delete("delete from student where id = #{id}")
	public void deleteDATA(int id);
	
	@Select("select * from student")
	public List<Student> selectAll();
}
