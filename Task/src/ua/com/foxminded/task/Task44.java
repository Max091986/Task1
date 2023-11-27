package ua.com.foxminded.task;

//Create a univariate array of int type, with the length of 20. 
//Fill the elements with random numbers from 0 to 100.
//Find the element (index) that has the highest value in the array and display it in the console. 

public class Task44 {

	public static void main(String[] args) {
	
	     int arr[] = {12, 13, 10, 34, 1, 5, 99, 25, 30, 35, 40, 45, 50, 55, 59, 60, 69, 70, 75, 79 };
	     int max = arr[0];
	     for(int i=0; i<arr.length; i++)
	     {
	       if(max < arr[i])
	       {
	          max = arr[i];
	       }
	     }
	    System.out.print("The highest value in the array" +" = " + max); 
	  }
	
	}


