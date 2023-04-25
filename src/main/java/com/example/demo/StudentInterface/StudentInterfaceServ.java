package com.example.demo.StudentInterface;
import java.util.List;

import com.example.demo.model.Student;


public interface StudentInterfaceServ {

	Student saveStd(Student std);
	List<Student>  getStdsFromDb();
	Student getStudentById(int id);
	Student updateStdDetails(Student std, int id);
	void deleteStdById(int id);
}

