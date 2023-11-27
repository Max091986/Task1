package ua.com.foxminded.task;

//Write a code that brings the number A into the integral-value deg N (N>0). 
//A number and a deg are entered from a keyboard.
//For instance: A = 2, N = 3, the answer is 8./

import java.util.Scanner;
public class Task381 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int sum=0;
	    	{
	          System.out.println("Enter number A" + " ");
	   }
	      	 int a =  sc.nextInt();
	         
	    	 System.out.println("Enter Deg N from 0 to 360" + " ");
	    
	    	int n = sc.nextInt();
	    	sum = a+n;
	    	for(int i = sum; i<=360; i++) {
	    		
	    	}
	    	
	      if (sum <=30 ) {
	    		System.out.println("N = 10");
	    		}
	   
	   else if (sum>30 & sum<90) {
	    		System.out.println("N = 20");	
	    		}
	   else if (sum>90 & sum<180) {
	    		System.out.println("N = 30");
	   }
	   else	if (sum>180 & sum<360) {
	    		System.out.println("N = 90");
	   }
	   else  {
	    		 System.out.println("Sum = 0");
	   }
	     sc.close(); 
	} 
}

