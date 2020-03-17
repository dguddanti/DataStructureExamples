
public class TwoDimenArrayExample {
	
	public static void main(String[] args) {
		
		int twoDimenArray[][] = new int[2][2];
		
		twoDimenArray[0][0] = 10;
		twoDimenArray[0][1] = 20;
		twoDimenArray[1][0] = 30;
		twoDimenArray[1][1] = 40;
		
		for (int i = 0; i < twoDimenArray.length; i++) {
			
			for (int j = 0; j < twoDimenArray[i].length; j++)
				
				System.out.printf("element at [%d][%d] is %d: \n", i, j, twoDimenArray[i][j]);
			
		}
		
	}
	
}
