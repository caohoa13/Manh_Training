package Training;
import java.util.Scanner;
public class MaxMang2Chieu {
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
		int max = a[0][0];
		for(i = 0; i < length; i ++) {
			for(j = 0; j < length; j ++) {
				if(max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		System.out.println("Max la: " + max);
	}
}
