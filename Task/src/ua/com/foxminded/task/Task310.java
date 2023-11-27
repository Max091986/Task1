package ua.com.foxminded.task;
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
