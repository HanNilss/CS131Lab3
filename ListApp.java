/**
 * Application class to test array list functionality
 * @author Hannes Nilsson
 * @version 1.0
 * Module 3 lab
 * CS1313ON
 */
package arraylist;

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>(6);
		ArrayList<Square> ar2 = new ArrayList<Square>(3);
		ArrayList<PointThreeD> ar3 = new ArrayList<PointThreeD>(3);
		
		//Adding strings to ar1
		ar1.addItem("Hello");
		ar1.addItem(",");
		ar1.addItem("my");
		ar1.addItem("name");
		ar1.addItem("is");
		ar1.addItem("Hannes.");
		//Adding squares to ar2
		ar2.addItem(new Square(2.0));
		ar2.addItem(new Square(3.0));
		ar2.addItem(new Square(24.5));
		
		ar3.addItem(new PointThreeD(1.0,3.0,5.0));
		ar3.addItem(new PointThreeD(23.0,-2.0,8.5));
		ar3.addItem(new PointThreeD(3.1415,2.7182,1.414));
		//Adding 3d points to ar3
		System.out.println(ar1.toString());
		System.out.println(ar2.toString());
		System.out.println(ar3.toString());
		

	}//end main

}//end class
