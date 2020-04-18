
public class SubtractionClassB extends AdditionClassA {

	public static void subtract(int a, int b) {
		
		int ans = a - b;
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		
		SubtractionClassB b = new SubtractionClassB();
		
		b.add(5, 23);
		
		b.subtract(19, 6);

	}

}
