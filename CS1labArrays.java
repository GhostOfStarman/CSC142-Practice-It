//Completed 1/29/20
//Practice-it 142 Lab: Arrays

import java.util.*;

public class CS1labArrays {

	public static void main(String[] args) {
		

	}
	
	
		//REVERSEARR: reversing order of an array
		int[] reverseArr(int[]inputArr){
			
			int[] outArr = new int[inputArr.length];
			
			for(int i = 0; i < inputArr.length/2; i++) {
				
				int temp = inputArr[i]; //grabs beginning digit to add to end later
				
				
				inputArr[i] = inputArr[inputArr.length - i - 1]; //beginning digit switched TO end digit
				
				
				inputArr[inputArr.length - i - 1] = temp; //end digit switched TO beginning digit
				
				//notice staircase pattern; when a variable is declared, that value is redeclared in the next line
				//importance of inputArr.length/2: use middle digit as pivot so the switches start from the outermost digits, going in
				
			}
			
			
			return outArr;
			
		}
		
		//STAGGERARR: takes an array, returns new array with each element appearing twice
		static int[] staggerArr(int[] inputArr) {
		
			
			//creates new array twice as long as original
			int[] staggedArr = new int[inputArr.length*2];
			
			//init counter for indexing through the NEW array
			int n = 0;
			
			
			for(int i = 0; i < inputArr.length; i++) {
			
				//use temp variable to grab values from the ORIGINAL array
				int temp = inputArr[i];
				
				//index of new array and the next index equal the value from OG array
				staggedArr[n] = temp;
				staggedArr[n+1] = temp; 
				
				//every two values are the same, so increment n by 2
				n+=2;
			}
			
			return staggedArr;
			
		
		}
		
		
		//SWAP: given two indexes, the values of the indexes are swapped within the given array
		static int[] swap(int[] input, int swap1, int swap2) {
			
			int[] swappedArr = input;
	        
			//grabs values
	        int temp1 = input[swap1];
			int temp2 = input[swap2];
			
			//switches values
			swappedArr[swap1] = temp2;
			swappedArr[swap2] = temp1;
				
				
			return swappedArr;
			
		}
		
		
		//SWAPALL: given two arrays, swap all elements from one array to the other
		static void swapAll(int[] a1, int[] a2){
			//swaps all elements from two arrays and stores
			
			
			 for(int i = 0; i< a1.length; i++){
			     
			     int temp1 = a1[i];
			     
			     int temp2 = a2[i];
			     
			     a1[i] = temp2;
			     
			     a2[i] = temp1;
			     
			 }
			}
			
		
		//COPYRANGE: l = range of copy from a1, starts copying from a1 starting from i1, copies that part of the array into a2 starting at i2
		public static void copyRange(int[] a1, int[] a2, int i1, int i2, int l){
		    
			//create new array to store the copied range in the first array
	        int[] arrSlice = new int[l];
			
	        //iterates through the first array at i1, grabs values and stores into arrSlice
			for(int i = i1; i < i1+l; i++){
		        
		        System.out.println(a1[i]);
		        
		        int temp = a1[i];
		        
		        arrSlice[i-i1] = temp;
		    
			}
			
			//this loop iterates through the values of the arrSlice array and replaces the values starting at i2
			for(int j = 0; j < arrSlice.length; j++) {
	        	
	        	int temp = arrSlice[j];
	        	
	        	a2[i2 + j] = temp;
	        	
	        }
		}
		
		
		//EQUALS: asserts whether two input arrays are equal or not(same order, same length)
		boolean equals(int[] a1, int[] a2) {
			
			//if the lengths of both arrays aren't the same, return false
			if(a1.length != a2.length) {
				
				return false;
			}
			
			//iterates through both arrays, if there is at least one value that doesn't match, return false
			for(int i = 0; i < a1.length; i++) {
				
				if(a1[i] != a2[i]) {
					
					return false;
					
				}
				
			}
			
			//otherwise, the arrays are equal
			return true;
			
		}

}
