package DSA;

import java.util.Arrays;

import org.junit.Test;

public class ArrayImplementations {

	
	/*
	 * a. add to the specific index
	b. print the array value as string
	c. contains
	d. remove a value
	e. trim to the given length
	 */
	
	@Test
   public void test1() {
	   int[] arr = {1, 2, 3, 4, 5};

	
	arr = array(arr, 2, 10, "Add");

	arr = array(arr, 0, 0, "Print");

	arr = array(arr, 0, 5, "Contains");

	arr = array(arr, 0, 4, "Remove");

	arr = array(arr, 0, 3, "Trim");

   }
	public int[] array(int[] arr, int index, int value, String Operation) {

		if(Operation.equals("Add")) {
			int[] arr1 = new int[arr.length+1];
			for(int i =0, j=0;i<arr1.length;i++) {
			if(i==index) {
				arr1[i] = value;
			}
			  else {
	                arr1[i] = arr[j++];
	            }
		}
			return arr1;
	
		} 
		  
		else if(Operation.equals("Print")) {
			String arrStr = Arrays.toString(arr);
			System.out.println(arrStr);
			return arr;
	
		} 
		else if(Operation.equals("Contains")) {
			boolean flag=false;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==value) {
					flag= true;
					break;
				}
			}
			System.out.println(flag);
			String arrStr = Arrays.toString(arr);
			System.out.println(arrStr);
			return arr;
		
	
		} 
		else if(Operation.equals("Remove")) {
			int[] arr1 = new int[arr.length-1];
	        for (int i = 0, j=0; i < arr.length; i++) {
	            if (arr[i] != value) {
	              
					arr1 [j++] = arr[i];
	            }
	        }
	        System.out.println(Arrays.toString(arr1));
	       return arr1;
		} else if (Operation.equals("Trim")) {
			 int[] arr1 = Arrays.copyOf(arr, 4);
			 System.out.println(Arrays.toString(arr1));
			
		        return arr1;
	    
	    }
          else {
       System.out.println("Invalid operation");
		return arr;
		
	}
	        }
}
	       
	        
	    
	

