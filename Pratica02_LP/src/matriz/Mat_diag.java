package matriz;
public class Mat_diag {

	public static void main(String[] args) {

		int x=1;
		int matrizNum[][] = new int [50][50];

		for(int i=0; i<50; i++) {
			for(int j=0; j<50; j++) {
			matrizNum[i][j] = x = x+2;
			
			if (i == j)
				System.out.println(matrizNum[i][j]);
				}
			}
	}

}
