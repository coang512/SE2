package tut9_se2.to_dos.abstract_factory;

import tut9_se2.to_dos.prototype.Circle;

/* Create ShapeFactory class extending AbstractFactory to generate 
 * object of concrete class based on given information. 
 */

public class ShapeFactory extends AbstractFactory {
	// TO-DO: Implement the getShape() method
	@Override
	public Shape getShape(String shapeType) {
		/*
		 * check for the shape type is equal to 'Rectangle' or 'Square' (ignore case)
		 * then return the corresponding type
                
		 */
                if(shapeType.equalsIgnoreCase("Rectangle")) return new Rectangle();
                else if(shapeType.equalsIgnoreCase("Square")) return new Square();
		return null;
	}

    public tut9_se2.to_dos.prototype.Shape getShape() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
