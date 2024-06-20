/**
 * Simple Class describing a square
 * @author Hannes Nilsson
 * @version 1.0
 * Module 3 lab
 * CS1313ON
 */
package arraylist;

public class Square {

	private double side;

	public Square() {
		
	}//end empty-argument constructor
	
	/**
	 * @param side
	 */
	public Square(double side) {
		super();
		this.side = side;
	}//end preferred constructor

	public double getArea() {
		 return getSide()*getSide();
	}//end getArea
	
	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}//end getSide

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}//end setSide
	/**
	 * @return string containing side and area
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + ", area="+getArea()+"]";
	}//end toString

}//end class
