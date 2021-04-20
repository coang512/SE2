package dao;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentService {
	public List<Student> getAllStudent(){
		Student s1 = new Student(1, "ST01", "0978963569");
		Student s2 = new Student(2, "ST02", "0789586236");
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		return students;
	}
}
