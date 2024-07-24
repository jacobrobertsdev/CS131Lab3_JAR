package test;
import items.*;
import arraylist.*;

public class ListApp {

	public static void main(String[] args) {

		// Create ArrayLists
		ArrayList<String> stringArray = new ArrayList<String>();
		ArrayList<Square> squareArray = new ArrayList<Square>();
		ArrayList<PointThreeD> pointArray = new ArrayList<PointThreeD>();
		
		// Test String ArrayList
		// Add strings to array
		stringArray.addItem("Hello");
		stringArray.addItem("Testing");
		stringArray.addItem("123");
		
		// Print String Array
		System.out.println(stringArray);
		
		// Test Square ArrayList
		// Populate Square ArrayList
		for(int i = 0; i < 4; i++) {
			Square s = new Square((double)i);
			squareArray.addItem(s);
		}
		
		// Print Square ArrayList
		System.out.println(squareArray);
		
		// Test Point ArrayList
		// Instantiate point objects
		PointThreeD p1 = new PointThreeD(1.0, 3.4, 7.2);
		PointThreeD p2 = new PointThreeD(4.0, 1.5, 2.2);
		PointThreeD p3 = new PointThreeD(9.0, 7.4, 4.2);
		
		// Add points to array
		pointArray.addItem(p1);
		pointArray.addItem(p2);
		pointArray.addItem(p3);

		// Print Point ArrayList
		System.out.println(pointArray);


	}

}
