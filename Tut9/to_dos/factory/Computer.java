package to_dos.factory;

// Create the Computer class that extends Course abstract class 
class Computer extends Course {
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
        fee = 5;
        System.out.println(fee);
    }
} 
