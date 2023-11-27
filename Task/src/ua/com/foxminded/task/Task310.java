package ua.com.foxminded.task;
//A freehand row is given, it must be displayed without ‘a, e, i, o, u’ letters.
//For instance: London is the capital of Great Britain
//
//The result: Lndn s th cptl f Grt Brtn/

import java.util.Scanner;

public class Task310 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Original: ");
		 
		  String or = scanner.nextLine();
		    scanner.close();
		
		   String charsToRemove = "a,e,i,o,u";
		   
	        for (char c : charsToRemove.toCharArray()) {
	            or = or.replace(String.valueOf(c), "");
	        }
	 
	        System.out.println(or);
	    }

	}
