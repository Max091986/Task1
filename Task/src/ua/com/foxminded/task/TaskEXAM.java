package ua.com.foxminded.task;


import java.util.Arrays;
import java.util.Random;

public class TaskEXAM {

	public static void main(String[] args) {
		float armean =0;
		int sum = 0;
		int n = 100;
		Random rd = new Random(); // creating Random object
	      int[] arr = new int[n];
	      for (int i = 0; i < n; i++) {
	         arr[i] = rd.nextInt(100); // storing random integers in an array
	         sum = sum + arr[i];
	        
	      } armean = sum/n;
	      
	      Arrays.sort(armean); // Sorting array
	      
	       int[] distinct = removeDuplicates(arr);  
	      for (int i = 0; i < n; i++) 
	            if (arr[i] > armean) 
	         	
	                System.out.print(arr[i] + " ");

	}

	private static int[] removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

}
