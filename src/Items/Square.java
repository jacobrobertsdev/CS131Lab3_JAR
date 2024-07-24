package items;

public class Square {

	private double side;
	
	
	// Constructors
	
	public Square() {
		this.side = 0.0;
	}// End of empty-argument constructor
	
	public Square(double side) {
		this.side = side;
	}// End of preferred constructor
	
	// End of Constructors
	
	
	// Getters & Setters
	
	/**
	 * Gets the side
	 * @return side
	 */
	public double getSide() {
		return side;
	}// End of getSide
	

	/**
	 * Sets the side
	 * @param side (double)
	 */
	public void setSide(double side) {
		this.side = side;
	}// End of setSide
	
	// End of Getters & Setters
	

	/**
	 * Calculates and returns the area of the square
	 * @return area of square as a double
	 */
	
	public double getArea() {
		return this.side * this.side;
	}// End of getArea

	
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}// End of toString
	
}
