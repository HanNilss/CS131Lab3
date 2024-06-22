/**
 * Generic class describing an arrayList with a method to add an item 
 * @author Hannes Nilsson
 * @version 1.0
 * Module 3 lab
 * CS1313ON
 */

public class ArrayList<T> {

	/**
	 * Default size is for empty argument constructor
	 * Current item describes location for current item in the list
	 * arList[] descirbes any array list of any type bing used
	 */
	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

   	@SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  	/**
  	 * Method to add an item to the arrayList. 
  	 * 
  	 * @param item to be added
  	 * @return true if item was added, false if item was not added
  	 */
  	public boolean addItem(T item) {
  		
  		boolean result = true;
  		
  		if (currentItem < arList.length && currentItem > -1 && arList[currentItem] == null) {
  			arList[currentItem] = item;
  			currentItem++;
  			result = true;
  		}
  		else {
  			result = false;
  		}
  			
  		return result;
  	}//end addItem
	
  	/**
  	 * Builds a string containing the data from each item's toString method and returns everyhting as a string.
  	 */
  	public String toString() {
  		
  		StringBuilder sb = new StringBuilder("Array List: ");
  		
  		for (T item : arList) {
  			sb.append(item.toString() + " ");
  		}
  		
  		return sb.toString();
  	}//end toString
  	
}//end class
