package Training;

import java.util.Scanner;

public class SapXepMang2ChieuTheoHang {
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int length;
		System.out.println("Nhap length: ");
		length = inPut.nextInt();
		int[][] a = new int[length][length];
		System.out.println("Nhap mang a: ");
		int i, j, x, y;
		for(i = 0; i < length; i ++) {
			for(j = 0; j < length; j ++) {
				System.out.println("a["+ i +"]["+ j +"]: ");
				a[i][j] = inPut.nextInt();
			}
		}
		System.out.println("Mang a: ");
		for(i = 0; i < length; i ++) {
			for(j = 0; j < length; j ++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		for(i = 0; i < length; i ++) {
			for(j = 0; j < length; j ++) {
				for(x = 0; x < length - 1; x ++){
					for(y = x + 1; y < length; y ++) {
						if(a[i][x] > a[i][y]) {
							int temp = a[i][x];
							a[i][x] = a[i][y];
							a[i][y] = temp; 
						}
					}
				}
			}
		}
		System.out.println("Mang sau khi sap xep: ");
		for(i = 0; i < length; i ++) {
			for(j = 0; j < length; j ++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
