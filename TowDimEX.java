import java.util.Scanner;

public abstract class TowDimEX {

	public static void main(String[] args) {
		int twoDim1[][] = new int[3][4];
		int twoDim2[][] = { {1,2,3,4}, {2, 3, 4, 5}, {5, 6, 7, 8}};
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i < twoDim1.length; i++) {
			for(int j = 0; j < twoDim1[0].length; j++)
				twoDim1[i][j] = scn.nextInt();
		}
		for(int i = 0; i < twoDim1.length; i++) {
			for(int j = 0; j < twoDim1[0].length; j++)
				System.out.printf("%3d", twoDim1[i][j]);
			System.out.println();
		}
		for(int i = 0; i < twoDim2.length; i++) {
			for(int j = 0; j < twoDim2[0].length; j++)
				System.out.printf("%3d", twoDim2[i][j]);
			System.out.println();
		}
		}
		}


