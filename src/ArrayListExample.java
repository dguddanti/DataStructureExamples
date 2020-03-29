import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		
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
		
		boolean checkPurple = strList.contains("Purple");
		
		if (checkPurple)
			System.out.println("The arraylist  contains the word Purple.");
		else 
			System.out.println("The arraylist does not contain the word Purple.");
		
		strList.remove(3);
		
		System.out.println("Second term of the arraylist: " + strList.get(2));
		
		strList.set(4, "pink");
		
		System.out.println("The arraylist has been modified to: " + strList);
		
		System.out.println("The size of the arraylist is currently: " + strList.size());
		
		boolean checkEmpty = strList.isEmpty();
		
		if (checkEmpty)
			System.out.println("The arraylist is empty.");
		else 
			System.out.println("The arraylist is not empty.");
		
		/*
		 * I am not using removeRange method here as it is a protected method, and I
		 * cannot use in public. In order to use removeRange I would have to subclass
		 * ArrayList, but then all other code would depend on the subclass. I am instead
		 * using another method which has the same function.
		 */

		strList.subList(3, 6).clear();
		
		System.out.println("After clearing elements 3-6 inclusive, the arraylist is: " + strList);
		
		System.out.println("The word Compose is first present at the index: " + strList.indexOf("Compose"));
		
		int lastIndex = strList.lastIndexOf("Compose");
		
		if (lastIndex != -1)
			System.out.println("The word Compose is last present at the index: " + lastIndex);
		else
			System.out.println("The word Compose is not present in the arraylist.");
		
		ArrayList<String> removeList = new ArrayList <String>();
		
		removeList.add("Grant");
		removeList.add("Parade");
		removeList.add("Publish");
		
		strList.removeAll(removeList);
		
		System.out.println("After using removeAll() method: " + strList);
		
	}

}
