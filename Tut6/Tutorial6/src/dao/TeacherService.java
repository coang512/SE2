package dao;

import java.util.ArrayList;
import java.util.List;

import model.Teacher;

public class TeacherService {
	public List<Teacher> getAllTeachers(){
		List<Teacher> teachers = new ArrayList<Teacher>();
		Teacher t1 = new Teacher(1, "Quang", "Chemistry", 1.500);
		Teacher t2 = new Teacher(2, "Van", "Math", 1.550);
		teachers.add(t1);
		teachers.add(t2);
		return teachers;
	}
}
