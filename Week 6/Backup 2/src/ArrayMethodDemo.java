import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMethodDemo {
	public static void main(String args[]) {
		// randomArray();
		reverseOrder(randomArray());
		sum(randomArray());
		System.out.println("\n The sum of the randomly generated array is: " + sum(randomArray()));
	}

	public static Integer[] randomArray() {
		Integer[] arr = new Integer[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 1000);
		}
		return arr;
	}

	public static void reverseOrder(Integer[] intArr) {
		List<Integer> list = Arrays.asList(intArr);
		System.out.println("\n The random array is: " + Arrays.toString(intArr));
		Collections.reverse(list);
		System.out.print("\n The random array in reverse order is: " + Arrays.toString(intArr));
	}

	public static Integer sum(Integer[] intArray) {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		return sum;
	}
}

//Create an application containing an array that stores 10 integers. 
//The application should call five methods that in turn: 
//(1) display all the integers 
//(2) display all the integers in reverse order
//(3) display the sum of the integers
//(4) display all values less than a limiting argument
//(5) display all values that are higher than the calculated average value 
//Then, create another array that store 5 integers.
//Pass the two arrays to a method that will display the integer value(s), if any, that appear in both arrays 
//(note that the two arrays can have no stored values in common).