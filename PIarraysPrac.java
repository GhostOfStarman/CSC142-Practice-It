import java.util.*;

import org.graalvm.compiler.replacements.ArraysSubstitutions;

import java.io.*;


public class PIarraysPrac {

	public static void main(String[] args) {

	
	int[] list1 = new int[] {3, 8, 19, 11, 22};
		
	
	}
	
	
	
//	public static int findMin(int[] inputArr) {
//		
//		int min = inputArr[0];
//		
//		for(int i = 0; i < inputArr.length-1; i++) {
//			if(inputArr[i]<min) {
//				min = inputArr[i];
//			}
//		}
//		
//		return min;
//	
//	}
	
	
	
//	public static int[] stretch(int[] inputArr)
//	{
//		int[] stretchArr = new int[inputArr.length*2];
//		
//		
//		for(int i = 0; i<inputArr.length; i++) {
//			
//			int firstpl = inputArr[i]%2;
//			if(firstpl == 0) {
//				
//				int evenDiv = inputArr[i]/2;
//				
//				stretchArr[i] = evenDiv;
//				stretchArr[i+1]= evenDiv;
//			}
//			if(firstpl == 1) {
//				
//				int oddDiv1 = inputArr[i]/2 + 1;
//				int oddDiv2 = inputArr[i]/2 - 1;
//				
//				stretchArr[i] = oddDiv1;
//				stretchArr[i+1] = oddDiv2;
//			}
//			}
//		
//		return stretchArr;
//	}
	
	
	
//	public static void rotateRight(int[] inputArr)
//	{
//		int rotElem = inputArr[inputArr.length-1];
//	
//		
//		for(int i = inputArr.length-1; i >= 1; i--) {
//            
//            inputArr[i] = inputArr[i-1];
//			
//		}
//	
//		inputArr[0] = rotElem;
//
//		System.out.print(Arrays.toString(inputArr));
//	
//	}
	
	
//	public static int[]countLastDigits(int[] list)
//	{
//		int[] lastTracker = new int[10];
//		
//		for(int i = 0; i < list.length; i++) {
//			int arrCount = list[i]%10;
//			lastTracker[arrCount]++;
//        }
//		return lastTracker;
//    }

	
	
//	public static boolean isPalindrome(String input) {
//		
//		String lowerInput = input.toLowerCase(); 
//		
//		char[] strStorage = new char[input.length()];
//		
//		String strComp ="";
//		String strComp2 ="";
//		
//		for(int i = 0; i < input.length(); i++) {
//			strStorage[i] = lowerInput.charAt(i);
//		}
//		
//		for(int i = strStorage.length-1; i>= 0; i--) {
//			strComp += strStorage[i];
//		}
//		
//		for(int i = 0; i< strStorage.length; i++) {
//			strComp2 += strStorage[i];
//		}
//		
//
//		if(strComp.compareTo(strComp2) == 0) {
//			return true;
//		}
//		
//		return false;
//	}
	
}





