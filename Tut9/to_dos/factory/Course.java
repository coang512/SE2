package to_dos.factory;

// Create the abstract class called Course
abstract class Course {
	protected int duration; //in semesters
	protected double fee; //in dollars ($)

	// TO-DO: Declare 2 void abstract methods: getDuration(), getFeePerSemester()
        abstract void getDuaration();           
        abstract void getFreePerSemester();
	// TO-DO: Declare void method: calculateTotalFee(). Total = duration * fee
        public void calculateTotalFee(){
            double total = duration * fee;
        }
}