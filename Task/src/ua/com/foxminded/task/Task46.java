package ua.com.foxminded.task;
//Ask a user to type a raw of English text, count how many times there are a, u, i letters.

//https://www.baeldung.com/java-count-chars

//https://charactercounter.com/count-characters-in-java

//https://ru.stackoverflow.com/questions/1044961/java-%D0%B2%D1%8B%D0%B2%D0%B5%D1%81%D1%82%D0%B8-%D1%81%D0%BB%D0%BE%D0%B2%D0%B0-%D0%B8%D0%B7-%D1%82%D0%B5%D0%BA%D1%81%D1%82%D0%B0-%D0%B2-%D0%B0%D0%BB%D1%84%D0%B0%D0%B2%D0%B8%D1%82%D0%BD%D0%BE%D0%BC-%D0%BF%D0%BE%D1%80%D1%8F%D0%B4%D0%BA%D0%B5
//https://ru.stackoverflow.com/questions/1044961/java-%D0%B2%D1%8B%D0%B2%D0%B5%D1%81%D1%82%D0%B8-%D1%81%D0%BB%D0%BE%D0%B2%D0%B0-%D0%B8%D0%B7-%D1%82%D0%B5%D0%BA%D1%81%D1%82%D0%B0-%D0%B2-%D0%B0%D0%BB%D1%84%D0%B0%D0%B2%D0%B8%D1%82%D0%BD%D0%BE%D0%BC-%D0%BF%D0%BE%D1%80%D1%8F%D0%B4%D0%BA%D0%B5
import java.util.Scanner;
public class Task46 {

	      
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(" to enter the same worlds: ");
	  String line = sc.nextLine();

	        String[] lines = line.split("");
	        String a = "a";
	        String u = "u";
	        String i = "i";
	        int count = 0;
	        int count1 = 0;
	        int count2 = 0;
	        for(int j = 0; j < lines.length; j++){
	            if(a.equals(lines[j])){
	                count = ++count + 0;
	            }
	            if  (u.equals(lines[j])) {
	            	count1 = ++count1 + 0;
	            }
	            if   (i.equals(lines[j])) {
	            	count2 = ++count2 + 0;
	        }
	        }
	        
	        System.out.println(a + ": " + count);
	        System.out.println(u + ": " + count1);
	        System.out.println(i + ": " + count2);
	    }
}


	      
//		System.out.println(  );
		
		
//		  String[] num1 = {letter};
////	      int loopsum = 0; 
//	      for(String s : num1) { 
//	    	  char c = 0;
//			if ( c == 'o')
//				c=(char) (c + s.length()); 
//	       
//	        
//	        for (int i = strings.length - 3; i < strings.length; i++) {
//	            for (String letter : strings[i].split("")) {
//	                if (vowels.contains(letter)) {
//	                    System.out.print(letter + ", ");
//	                }
//	            }
//	        }
//	    }
//    }


//https://www.cyberforum.ru/java-j2se/thread2523760.html
//https://ru.stackoverflow.com/questions/1044961/java-%D0%B2%D1%8B%D0%B2%D0%B5%D1%81%D1%82%D0%B8-%D1%81%D0%BB%D0%BE%D0%B2%D0%B0-%D0%B8%D0%B7-%D1%82%D0%B5%D0%BA%D1%81%D1%82%D0%B0-%D0%B2-%D0%B0%D0%BB%D1%84%D0%B0%D0%B2%D0%B8%D1%82%D0%BD%D0%BE%D0%BC-%D0%BF%D0%BE%D1%80%D1%8F%D0%B4%D0%BA%D0%B5