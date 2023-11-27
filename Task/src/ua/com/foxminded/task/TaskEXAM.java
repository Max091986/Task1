package ua.com.foxminded.task;
//Create a univariate array of int type, with the length of N. 
//Fill the elements with random numbers from 1 to 100. 
//Find the arithmetic mean of its elements. 
//Display only those array elements that are bigger than the found arithmetic mean. 
//
//For instance, there are:
//
//[10, 20, 30, 40, 50]
//
//The result:
//40, 50

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
	      
	      Arrays.sort(arr); // Sorting array
	      
	   
	      for (int i = 0; i < n; i++) 
	            if (arr[i] > armean) 
	         	
	                System.out.print(arr[i] + " ");

	}

	
	}


