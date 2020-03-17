import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		String[] StrArray = {"blue", "grey", "black", "pink"};
		System.out.println("Original String Array: " + Arrays.toString(StrArray));
		
		StrArray[2] = "yellow";
		System.out.println("Modified String Array: " + Arrays.toString(StrArray));
	}

}
