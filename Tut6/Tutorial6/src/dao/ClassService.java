package dao;

import java.util.ArrayList;
import java.util.List;

import model.Class;

public class ClassService {
	public List<Class> getAllClasses(){
		List<Class> classes = new ArrayList<Class>();
		Class c1 = new Class("6C-18", "Long Vu", "Mrs.Nguyet");
		Class c2 = new Class("7C-18", "Minh Thao", "Mrs.Nguyet");
		classes.add(c1);
		classes.add(c2);
		return classes;
	}
}
