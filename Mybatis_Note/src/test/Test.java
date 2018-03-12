package test;

import com.ccut.domain.Student;
import com.ccut.service.CRUDimp;

public class Test {
	public static void main(String[] args) {
		CRUDimp cruDimp = new CRUDimp();
		Student student = new Student();
//		student.setId(1);
//		student.setName("徐艳当");
//		student.setSex("女");
		student.setId(2);
		student.setName("徐艳东");
		student.setSex("女");
	//	cruDimp.insert(student);
	//	cruDimp.update(student);
		cruDimp.selectOne(1);
		System.out.println("----------------------------------");
		cruDimp.selectAll();	
		cruDimp.delete(1);
		System.out.println("删除后");
		cruDimp.selectAll();	
		
		
	}
}
