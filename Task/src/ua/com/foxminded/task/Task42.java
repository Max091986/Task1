package ua.com.foxminded.task;

import java.util.Arrays;
import java.util.List;

public class Task42 {

	public static void main(String[] args) {

	    Double[] test = new Double[] {10.0,11.5,12.0,12.5, 13.0,13.5,14.0,15.0,15.5,16.0,16.5,17.0,18.5,19.5,20.0};
	    List<Double> list = Arrays.asList(test);
	    double sum = list.stream().mapToDouble(p -> p).sum();
	    

	    System.out.println("Sum of numbers = " + sum);

	

	  

	 
	
	  }


	
	}


