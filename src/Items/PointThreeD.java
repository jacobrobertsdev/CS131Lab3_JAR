package Items;

public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	// Constructors
	
	public PointThreeD() {
		this.xPoint = 0.0;
		this.yPoint = 0.0;
		this.zPoint = 0.0;
	}// End of empty-argument constructor
	
	
	public PointThreeD(double x, double y, double z){
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
	}// End of preferred constructor


	
	// Getters & Setters
	/**
	 * Gets X point
	 * @return the xPoint
	 */
	public double getxPoint() {
		return xPoint;
	}// End of getX


	/**
	 * Sets X point
	 * @param xPoint (double)
	 */
	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}// End of setX


	/**
	 * Gets Y point
	 * @return the yPoint
	 */
	public double getyPoint() {
		return yPoint;
	}// End of getY


	/**
	 * Sets Y point
	 * @param yPoint (double)
	 */
	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}// End of setY


	/**
	 * Gets Z point
	 * @return the zPoint
	 */
	public double getzPoint() {
		return zPoint;
	}// End of getZ


	/**
	 * Sets Z point
	 * @param zPoint (double)
	 */
	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}// End of setZ

	// End of Getters & Setters
	
	
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}
	
	
	
	
	
}
