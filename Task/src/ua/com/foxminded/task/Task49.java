package ua.com.foxminded.task;

import java.util.Scanner;

//Create a univariate array of int type, with the length of N. 
//Fill the elements with random numbers from 1 to 100. Find the arithmetic mean of its elements. 
//Display only those array elements that are bigger than the found arithmetic mean. 
//
//For instance, there are:
//
//[10, 20, 30, 40, 50]
//
//The result:
//40, 50

//Scanner sc = new Scanner(System.in);

//Arithmetic mean

public class Task49 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		  int sum = 0;
		    int count = 0;
		    int n = 0;

		    do {
		        System.out.println("Enter next number(-1 to exit): ");
		        n = sc.nextInt();
		        System.out.println("Value is :" + n);

		        if(n != -1)
		        {
		            count++;
		            sum = sum + n; 
		        }

		    }while ( n != -1);

		    sc.close();
		    System.out.println("Mean is: " + (double) sum/count);
		}

	}


