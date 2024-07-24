package arraylist;

public class ArrayList<T> {

	private final int DEFAULT_SIZE = 10;
   	private int currentIndex = 0;
   	private T arrList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList(){                                        				  	
			  
	arrList = (T[]) new Object[DEFAULT_SIZE];
	
    }//end empty-argument constructor 

   	
  @SuppressWarnings("unchecked")
    public ArrayList(int length){
	  
	  arrList = (T[]) new Object[length];
	  
    }//end preferred constructor
	
  
  	/**
  	 * Checks the bounds of arrList using DEFAULT_SIZE and currentIndex.
  	 * If array is full, returns false.
  	 * If there are empty slots, adds the item to the array and returns true.
  	 * 
  	 * @param item (object of type T)
  	 * @return boolean
  	 */
  	public boolean addItem(T item) {
  		
  		if (currentIndex == 9) {
  			System.out.println("ArrayList full, item not added.");
  			return false;
  			
  		} else if (currentIndex < 9) {
  			arrList[currentIndex] = item;
  			System.out.println("Item added successfully at index: " + currentIndex + ".");
  			System.out.println(DEFAULT_SIZE - (currentIndex + 1) + "slots remaining.");
  			currentIndex++;
  		}
  		
		return true;
  	}
  	
  	
  	@Override
  	public String toString() {
  		
		StringBuilder arrString = new StringBuilder("ArrayList content:\n");
		arrString.append("==========================================\n");
		
		for(int i = 0; i < arrList.length; i++) {
			
			arrString.append(i + ": " + arrList[i].toString() + "\n");
		}

		arrString.append("==========================================\n");
		return arrString.toString();
	} // End of toString
  
  
  
}//end class
