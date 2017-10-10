package Training;

import java.util.Scanner;

public class XoayMang90Do {
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int b, i, j;
		System.out.println("enter b: ");
		b = inPut.nextInt();
		int[][] a = new int[b][b];
		System.out.println("nhap gia tri cua mang: ");
		for(i = 0; i < b; i ++) {
			for(j = 0; j < b; j ++) {
				System.out.println("a["+i+"]["+j+"]");
				a[i][j] = inPut.nextInt();
			}
		}
		for(i = 0; i < b; i ++ ) {
			for(j = 0; j < b; j ++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int[][] aXoay = new int[b][b];
		for(i = 0; i < b; i ++) {
			int x = b - 1;
			for(j = 0; j < b; j ++) {
				aXoay[i][j] = a[x][i];
				x --;
			}
		}
		System.out.println("mang sau khi xoay 90 do: ");
		for(i = 0; i < b; i++) {
			for(j = 0; j < b; j ++) {
				System.out.print(aXoay[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
