package Training;

import java.util.Scanner;

public class SumRowMax {
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int length;
		System.out.println("Nhap length: ");
		length = inPut.nextInt();
		int[][] a = new int[length][length];
		System.out.println("Nhap mang a: ");
		int i, j;
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
		int[] sum = new int[length]; 
		int n = 0, temp =0, max = 0, index = 0;
		while(n < length) {
			for(j = 0; j < length; j ++) {
				temp += a[n][j];
			}
			sum[n] = temp;
			n++;
			temp = 0;
		}
		for(i = 0; i < length; i ++) {
			if(max < sum[i]) {
				max = sum[i];
				index = i + 1;
				
			}
		}
		
		System.out.println("Hang co tong lon nhat la hang thu " + index + " voi gia tri " + max);
	}
}
	

