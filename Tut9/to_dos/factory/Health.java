package to_dos.factory;

// Creating the Health class that extends Course abstract class 
class Health extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	public void getDuration() {
 
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
	public void getFeePerSemester() {
 
	}

    @Override
    void getDuaration() {
       duration = 5;
        System.out.println(duration);
    }

    @Override
    void getFreePerSemester() {
        fee = 8;
        System.out.println(fee);
    }
}// end of Health class.