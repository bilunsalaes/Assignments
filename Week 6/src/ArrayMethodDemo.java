import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class ArrayMethodDemo {

	// private static final Integer = null;
	public static void main(String args[]) {

		Integer[] a = randomArray();
		Arrays.sort(a);
		// Integer aboveAverage = null;
		reverseOrder(a);
		// aboveAverage(a);
		System.out.println("\n The sum of the randomly generated array is: " + sum(a));
		System.out.println("\n For this exercise the the average of the values is: " + average(a));
		System.out.println("\n For this exercise the values that are higher than the average are: ");
		System.out.println();
		aboveAverage(a);
		System.out.println();
		System.out.println();
		System.out.println("The random number between 1-999 that will be tested against the array = " + getNum(1, 999));

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

	public static Integer sum(Integer[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];

		return sum;
	}

	public static double average(Integer[] a) {
		double avg = 0;
		for (int i = 0; i < a.length; i++)
			avg += a[i];
		avg = avg / a.length;
		for (int i = 0; i < a.length; i++)
			;
		return avg;

	}

	public static void aboveAverage(Integer[] a) {
		double avg = 0;
		for (int i = 0; i < a.length; i++)
			avg += a[i];
		avg = avg / a.length;
		for (int i = 0; i < a.length; i++)
			if (a[i] > avg) {

				System.out.print(a[i] + " ");
			}
	}

	public static int getNum(int min, int max) {
		int i = (int) (Math.random() * ((max - min) + 1)) + min;

		return i;
	}
}

//Create an application containing an array that stores 10 integers. 
//The application should call five methods that in turn: 
//(1) display all the integers  --Done--
//(2) display all the integers in reverse order --Done--
//(3) display the sum of the integers --Done--
//(4) display all values less than a limiting argument
//(5) display all values that are higher than the calculated average value --Done--
//Then, create another array that store 5 integers.
//Pass the two arrays to a method that will display the integer value(s), if any, that appear in both arrays 
//(note that the two arrays can have no stored values in common).