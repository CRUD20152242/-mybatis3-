package test;

import com.ccut.domain.Student;
import com.ccut.service.CRUDimp;

public class Test {
	public static void main(String[] args) {
		CRUDimp cruDimp = new CRUDimp();
		Student student = new Student();
//		student.setId(1);
//		student.setName("���޵�");
//		student.setSex("Ů");
		student.setId(2);
		student.setName("���޶�");
		student.setSex("Ů");
	//	cruDimp.insert(student);
	//	cruDimp.update(student);
		cruDimp.selectOne(1);
		System.out.println("----------------------------------");
		cruDimp.selectAll();	
		cruDimp.delete(1);
		System.out.println("ɾ����");
		cruDimp.selectAll();	
		
		
	}
}
