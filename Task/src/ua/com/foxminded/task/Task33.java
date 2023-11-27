package ua.com.foxminded.task;

import java.text.DecimalFormat;

public class Task33 {

	public static void main(String[] args) {
		double n = 5.99;
		for(double a =  1, b = n; a < 23 && b < 200000000; a++, b +=n) {
			
			


			DecimalFormat numberFormat = new DecimalFormat("0.00");

			DecimalFormat numberFormat1 = new DecimalFormat("#");

			System.out.println(numberFormat1.format(a) + " = "+numberFormat.format (b) +"$");

			}



			}

			


	}


