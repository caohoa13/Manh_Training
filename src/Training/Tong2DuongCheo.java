package Training;

import java.util.Scanner;

public class Tong2DuongCheo {
	public static void main(String[] args) {
		int b, i, j;
		Scanner inPut = new Scanner(System.in);
		System.out.println("enter b: ");
		b = inPut.nextInt();
		System.out.println("Nhap mang: ");
		int[][] a = new int[b][b];
		for(i = 0; i < b; i ++) {
			for(j = 0; j < b; j ++) {
				System.out.println("a [" + i + "][" + j + "]: ");
				a[i][j] = inPut.nextInt();
			}
			System.out.println("");
		}
		for(i = 0; i < b; i ++) {
			for(j = 0; j < b; j ++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		int count1 = 0, count2 = 0;
		int c = b;
		for(i = 0; i < b; i ++) {
			for(j = 0; j < b; j ++) {
				if(i == j) {
					count1 += a[i][j];
				}
				if(j == c - 1) {
					count2 += a[i][j];
					c --;
				}
			}
		}
		System.out.println(count1 + " " + count2);
		System.out.println("tong 2 duong cheo la: " + (count1 + count2));
	}
}
