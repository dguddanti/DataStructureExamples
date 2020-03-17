
public class CopyingArray {

	public static void main(String[] args) {
		
		int A[] = {1,5,10,8,45,3,233,4,9,6};
		
		int B[] = new int[A.length];
		
		for (int index = 0; index < A.length; index++) {
			B[index] = A[index];
			
			// to show what is in Array B
			System.out.println(B[index]);
		}

	}

}
