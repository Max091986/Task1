package ua.com.foxminded.task;
//A user enters a row with symbols of different cases (uppercase and lowercase letters). 
//Write a code that changes the case of every symbol to the opposite one. 
//
//For example, if the input is, "PracTice MaKeS PeRfecT", the output should be the array "pRACtICE mAkEs pErFECt".
import java.util.Scanner;
public class Task50 {

	public static void main(String[] args) {
		  
////		https://www.tutorialspoint.com/capitalize-last-letter-and-lowercase-first-letter-of-a-word-in-java
//input String
	      
	      Scanner sc = new Scanner(System.in);
	    
	      System.out.println("Enter text: ");
	        String str = sc.nextLine();
	      //get length of string
	      int size = str.length();
	      
	      //find last character and convert it to upper case
	      char last = str.charAt(size - 1);
	      String finalLast = (String.valueOf(last)).toUpperCase();
	      
	      char therdly = str.charAt(size-1);
	      String third = (String.valueOf(therdly)).toUpperCase();
	      
	      
	      //find first character and convert it to lowercase
	      char first = str.charAt(0);
	      String finalFirst = (String.valueOf(first)).toLowerCase();
	      
	      //find middle characters
	      String middle="";
	      for(int i=1; i<size-1; i++){
	         String s = String.valueOf(str.charAt(i));
	         middle=middle+s;
	      }
	      
	      //find the updated string 
	      String result = finalFirst +middle+finalLast;
	      System.out.println("Updated string: "+result);
	   }
	

	}


