import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		
		int[] number = new int[15];
		System.out.println("Integer Array: " + Arrays.toString(number));
		
		int length = number.length;
		
		for (int index = 0; index < length; index++) {
			number[index] = index;
			System.out.println(number[index]);
		}
		
		int emptyArray[] = null; 
		System.out.println("Empty Integer Array: " + Arrays.toString(emptyArray));
		int array[] = {1,2,3,4,5};
		System.out.println("Array of size 5 with 5 elements: " + Arrays.toString(array));
		boolean[] boolarray = new boolean[] {true, true, false, true };
		System.out.println("Boolean Array: " + Arrays.toString(boolarray));
		boolean[] emptyboolarray = new boolean[2];
		System.out.println("Empty Boolean Array: " + Arrays.toString(emptyboolarray));
		char[] charArr = new char[] { 'D', 'h', 'r', 'i', 't', 'i'};
		System.out.println("Character Array: " + Arrays.toString(charArr));
		String[] strArray = {"Hello World", "hi"};
		System.out.println("String Array: " + Arrays.toString(strArray));
		double[] doubleArray = new double[] {1, 2, 3, 4, 5};
		System.out.println("Double Array: " + Arrays.toString(doubleArray));
	}

}
