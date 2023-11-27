package ua.com.foxminded.task;

import java.util.Arrays;
//import java.util.Scanner;

//Create a univariate array of int type, with the length of 20. 
//Fill the elements with random numbers from -50 to 50. 
//Count and display the sum of all the positive array elements in the console.

//https://www.geeksforgeeks.org/java-program-to-split-an-array-from-specified-position/
public class Task43 {




	
	  public static void main(String[] ars) {
	   
	int sum = 0;
	int[] inp = {-50, -45,-40,-35,-30,-25,-20,-10,-5, -1, 1, 5, 10, 25, 30, 35, 40, 45,48, 50 };

for (int i = 0; i < inp.length; i++) {

if (inp[i] > 0) {

    sum = sum + inp[i];
}
  
}
 System.out.println(sum);
	       }
}
	
	
  
   