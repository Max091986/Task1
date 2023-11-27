package ua.com.foxminded.task;

import java.util.Scanner;
public class Task39 {


	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Original: ");
	 
	    String originalStr = scanner.nextLine();
	    scanner.close();
	 
	    String words[] = originalStr.split("\\s");
	    String reversedString = "";
	 
	    for (int i = 0; i < words.length; i++) 
	    {
	      String word = words[i];
	      String reverseWord = "";
	      for (int j = word.length() - 1; j >= 0; j--) {
	    	  
	        reverseWord = reverseWord + word.charAt(j);
	      }
	      reversedString =" "+ reverseWord + reversedString  ;
	    }
	 
	    System.out.print("Reversed : " + reversedString);
	  }
	}
