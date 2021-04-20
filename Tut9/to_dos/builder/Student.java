package to_dos.builder;

//Create the Student class with a static nested (inner class)
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	private String course;

	//TO-DO: Implement the constructor
	public Student(StudentBuilder studentBuilder) {   
            this.id = studentBuilder.id;
            this.firstName = studentBuilder.firstName;
            this.lastName = studentBuilder.lastName;
            this.age = studentBuilder.age;
            this.phone = studentBuilder.phone;
            this.address = studentBuilder.address;
            this.course = studentBuilder.course;
	}
	public int getId() {
		return id; 
	}

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //TO-DO: Implement GETTERs & SETTERs for given attributes
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //TO-DO: Implement toString() method to display student's information
    @Override
    public String toString() {
        return null;
    }
	
	// Create the StudentBuilder inner class
	public static class StudentBuilder {
		//TO-DO: Initialize the similar attributes with Student class
                private int id;
                private String firstName;
                private String lastName;
                private int age;
                private String phone;
                private String address;
                private String course;
                
		//TO-DO: Implement the constructor
		public StudentBuilder(int id, String firstName, String lastName) {
                    this.id = id;
                    this.firstName = firstName;
                    this.lastName = lastName;
		}

        public StudentBuilder(int id, String firstName, String lastName, int age, String phone, String address, String course) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.phone = phone;
            this.address = address;
            this.course = course;
        }

		//TO-DO: Implement the 3 below methods
		public StudentBuilder withOptionalAge(int age) {
			return null;
		}

		public StudentBuilder withOptionalPhone(String phone) {
			return null;
		}

		public StudentBuilder withOptionalAddress(String address) {
			return null;
		}

		public Student buildStudent() {
			validateStudentData();
			return new Student(this);
		}

		private boolean validateStudentData() {
			// Validation process, check if student is registered in the database
			return true;
		}
	}
}
