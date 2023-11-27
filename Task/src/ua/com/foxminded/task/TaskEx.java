package ua.com.foxminded.task;

import java.util.Scanner;

public class TaskEx {
private static Scanner sc;
	
	public static void main(String[] args) {
		String Size, i, num, occr;
		
		sc = new Scanner(System.in);
		
		System.out.print("Please Enter  = ");
		Size = sc.nextLine();
		
		String[] arr = {Size}; // Слова появляются в массиве
		
	
		
		System.out.print("Please Enter  Item Letters to Know = ");
		num = sc.nextLine();
		
		for( i = 0; i < 1000; i++) 
		{
			if(arr[i] == num)
			{
				occr++;
			}
		}
		
		System.out.println(num + " Occurred " + occr + " Times.");
	}
}
	
	
