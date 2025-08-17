package pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Samp222222 {

	public static void main(String[] args) {

		
		 int count = 1; 
		 int arr[] = { 7, 4, 8, 2, 9 }; 
	        // Start traversing element 
	        int curr_max = arr[0]; 
	        for (int i = 1; i < arr.length; i++) { 
	            
	            // If curr_element is maximum  
	            // or current element 
	            // is equal, update maximum and increment count 
	            if (arr[i] > curr_max || arr[i] == curr_max) { 
	                count++; 
	              
	                curr_max = arr[i]; 
	            } 
	           
	        } 
		 
	        System.out.print("Count:  "+ count);
		/*
		 * int u = 9; Integer a1[] = { 5, 6, 4, 7, 12, 18, 9, 10, 6 }; boolean contains
		 * = Arrays.stream(a1).anyMatch(x -> x == u); System.out.println("contains: " +
		 * contains);
		 */

	}
}