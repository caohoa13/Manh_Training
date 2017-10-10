package Training;

import java.util.Scanner;

public class NhapMang2Chieu {
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int b, i, j;
		System.out.println("enter b: ");
		b = inPut.nextInt();
		int[][] a = new int[b][b];
		System.out.println("Nhap gia tri cua mang: ");
		for (i = 0; i < b; i++) {
			for (j = 0; j < b; j++) {
				System.out.println("a[ " + i + " ][" + j + "]:");
				a[i][j] = inPut.nextInt();
			}
		}
		for (i = 0; i < b; i++) {
			for (j = 0; j < b; j++) {

				System.out.print("\t" + a[i][j]);
			}
			System.out.println();
		}
	}
}
