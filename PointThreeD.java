/**
 * Simple class describing a point within a 3d plane
 * @author Hannes Nilsson
 * @version 1.0
 * Module 3 lab
 * CS1313ON
 */

package arraylist;

public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	/**
	 * constructs a 3d point with default values at the origin
	 */
	public PointThreeD() {
		this.xPoint = 0.0;
		this.yPoint = 0.0;
		this.zPoint = 0.0;
	}//end empty-argument constructor
	
	/**
	 * Constructs a 3d point with coordinates passed as arguments
	 * 
	 * @param xPoint
	 * @param yPoint
	 * @param zPoint
	 */
	public PointThreeD(double xPoint, double yPoint, double zPoint) {
		super();
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		this.zPoint = zPoint;
	}//end preferred constructor

	/**
	 * @return the xPoint
	 */
	public double getxPoint() {
		return xPoint;
	}//end getxPoint
	/**
	 * @param xPoint the xPoint to set
	 */
	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setxPoint
	/**
	 * @return the yPoint
	 */
	public double getyPoint() {
		return yPoint;
	}//end getyPoint
	/**
	 * @param yPoint the yPoint to set
	 */
	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}//setyPoint
	/**
	 * @return the zPoint
	 */
	public double getzPoint() {
		return zPoint;
	}//getzPoint
	/**
	 * @param zPoint the zPoint to set
	 */
	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}//setzPoint

	/**
	 * Returns a string with data from the 3d point
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
}//end class
