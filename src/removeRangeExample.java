import java.util.ArrayList;

public class removeRangeExample extends ArrayList<String> {
	
	public static void main(String[] args) {
		
		removeRangeExample strList = new removeRangeExample();
		
		strList.add("Small");
		strList.add("Suitcase");
		strList.add("Publish");
		strList.add("Divide");
		strList.add("Finish");
		strList.add("Stream");
		strList.add("Purple");
		strList.add("Grant");
		strList.add("Compose");
		strList.add("Sharp");
		strList.add("Compose");
		
		System.out.println("Original arraylist: " + strList);
		
		strList.removeRange(3, 6);
		System.out.println("Arraylist after using removeRange: " + strList);
		
	}

}
