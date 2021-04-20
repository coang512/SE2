package tut9_se2.to_dos.prototype;


import java.util.Hashtable;
import java.util.Scanner;
import tut9_se2.to_dos.abstract_factory.ShapeFactory;

/* Create the ShapeCache class to get concrete classes from database 
   and store them in a Hashtable. */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	/*
	 * TO-DO: Implement the loadCache() method 
	 * For each shape run database query and
	 * create shape shapeMap.put(shapeKey, shape);
	 */
	public static void loadCache() {
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();
            Shape shape = getShape(id);
            
           Shape sm = shapeMap.put(shape.getType(),shape);
	}
}