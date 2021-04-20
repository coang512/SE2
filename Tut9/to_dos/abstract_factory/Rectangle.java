package tut9_se2.to_dos.abstract_factory;

// Create the Rectangle concrete class implementing the Shape interface.
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
