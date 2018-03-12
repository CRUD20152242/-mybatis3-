package com.ccut.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ccut.DAO.CRUD;
import com.ccut.MybatisUtil.Util;
import com.ccut.domain.Student;

public class CRUDimp {
	public void insert(Student student){
		SqlSession session = Util.getSession(true);
		CRUD crud = session.getMapper(CRUD.class);
		crud.insertDATA(student);
		session.close();
	}
	
	public void delete(int id){
		SqlSession session = Util.getSession(true);
		CRUD crud = session.getMapper(CRUD.class);
		crud.deleteDATA(id);
		session.close();
	}
	
	public void update(Student student){
		SqlSession session = Util.getSession(true);
		CRUD crud = session.getMapper(CRUD.class);
		crud.updataDATA(student);
		session.close();
	}
	 public void selectOne(int id){
		 	SqlSession session = Util.getSession(true);
			CRUD crud = session.getMapper(CRUD.class);
			Student student = crud.selectDATA(id);
			session.close();		
			System.out.println("id = "+student.getId()+" name = "+student.getName()+" sex = "+student.getSex());
			
	 }
	 
	 public void selectAll(){
		 SqlSession session = Util.getSession(true);
		 	CRUD crud = session.getMapper(CRUD.class);
			List<Student> list = crud.selectAll();
			session.close();		
			for(Student student:list){
				System.out.println("id = "+student.getId()+" name = "+student.getName()+" sex = "+student.getSex());
			}
	 }
	
	
}
