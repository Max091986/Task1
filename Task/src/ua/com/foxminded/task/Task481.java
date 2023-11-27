package ua.com.foxminded.task;

public class Task481 {

//	public static void main(String[] args) {
		public static int[] readInputs(int arraySize) {
		    System.out.print("What length is the array? ");
		    arraySize = console.nextInt();
		    int[] intArray = new int[arraySize]; 
		    for (int i = 0; i <= intArray.length - 1; i++) {
		        System.out.print("Enter an integer: ");
		        userInput = console.nextInt();
		        intArray[i] = userInput;
		    }
		    return intArray;
		        } //end of readInputs()

	}

}
