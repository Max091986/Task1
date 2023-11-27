package ua.com.foxminded.task;
import java.util.Scanner;
public class CharArray {

	public static void main(String[] args) {
		
//		 int occr = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		 String message = sc.nextLine();
		 char[] charArray = message.toCharArray();
System.out.println(charArray);

       for(int i = 0; i < charArray.length; i ++) {
    	   if (charArray[i]%2 != 0 ) {
    		   System.out.println(charArray[i]);
    	   }
       }
       for(int i = 0; i < charArray.length; i ++) {
    	   if (charArray[i]%2 == 0 ) {
    		  
			int occr = 0;
			occr++;
    		   
    	   }System.out.println(charArray[i]);
       }
	}

}
