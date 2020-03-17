
public class ThreeDimenArrayExample {

	public static void main(String[] args) {
		
		int ThreeDimenArray[][][] = new int[2][2][2];
		
		ThreeDimenArray[0][0][0] = 1;
		ThreeDimenArray[0][0][1] = 2;
		ThreeDimenArray[0][1][0] = 3;
		ThreeDimenArray[0][1][1] = 4;
		ThreeDimenArray[1][0][0] = 5;
		ThreeDimenArray[1][0][1] = 6;
		ThreeDimenArray[1][1][0] = 7;
		ThreeDimenArray[1][1][1] = 8;
		
		for (int i = 0; i < ThreeDimenArray.length; i++) {
			
			for (int j = 0; j < ThreeDimenArray[i].length; j++)
				
				for (int k = 0; k < ThreeDimenArray[j].length; k++)
				
					System.out.printf("element at [%d][%d][%d] is %d: \n", i, j, k, ThreeDimenArray[i][j][k]);
			
		}
	}

}
