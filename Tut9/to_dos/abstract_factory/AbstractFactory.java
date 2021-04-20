package tut9_se2.to_dos.abstract_factory;

//Create the AbstractFactory class to get factories for Normal and Rounded Shape Objects.
public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
}
