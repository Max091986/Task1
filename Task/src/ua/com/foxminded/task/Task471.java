package ua.com.foxminded.task;

import java.util.ArrayList;
import java.util.Scanner;

//
//An array of integers is given. Write a code that will turn every negative element of the array into positive ones.
//
//Display the result in the console.
//
//For example, there are:
//
//[10, -20, 30, -40, 50]
//
//The result: 
//
//[10, 20, 30, 40, 50]
//
//PS. Data should be saved in the same array

//https://stackoverflow.com/questions/61163029/negative-numbers-in-array-into-positives-java

//https://mkyong.com/java/how-to-convert-negative-number-to-positive-in-java/
public class Task471 {

	
		
		public static void main(String[] args) {
	        int givenNumber;
	        int positiveNumber;

	        Scanner sc = new Scanner(System.in); 
	            System.out.println("Enter a number: ");
	        

	            givenNumber = sc.nextInt();

	            if (givenNumber < 0) {
	                positiveNumber = givenNumber * (-1);
	                System.out.println("Positive number: " + positiveNumber);
	            } else {
	                System.out.println("Please enter a positive number");
	            }
	        

	    }
	
	}


