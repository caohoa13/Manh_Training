package Training;
import java.util.Scanner;
public class SapXepMangTangDan {
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0; i < array.length; i ++) {
			System.out.println("nhap phan tu co vi tri so " + i);
			array[i] = inPut.nextInt();
		}
		for(int i = 0 ; i < array.length - 1; i ++) {
			for(int j = i+1 ; j < array.length; j ++) {
				if(array[i] > array[j]) {
					int a  = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}   
		}
		System.out.println("Mang sau khi sap xep tang dan:");
		for(int i = 0; i < array.length; i ++) {
			System.out.print(" " + array[i]);
		}
		System.out.println("");
		System.out.println("Phan tu lon thu 2 trong mang la: " + array[array.length - 2]);
		System.out.println("Phan tu nho thu 2 trong mang la: " + array[1]);
	}
}

