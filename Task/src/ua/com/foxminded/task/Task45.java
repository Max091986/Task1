package ua.com.foxminded.task;

//import java.util.Scanner;

//The height of 20 people is known. Find out the mean value of a height:
//
//Create a univariate array of int type, with the length of 20. 
//Fill the elements with random numbers from 150 to 195. 
//Count and display the arithmetic mean of array elements in the console (mean value of a height).

public class Task45 {

	public static void main(String[] args) {
		  
			  double [] arr = {150,153,155,158,160,162,165,169,170,174,175,176,180,183,185,187,190,192,194,195};
		        double total = 0;

		        for(int i=0; i<arr.length; i++){
		        	total = total + arr[i];
		        }

		        double average = total / arr.length;
		        
		     
		        System.out.format("The arithmetic mean: %.3f", average);
		  }
	}	

	