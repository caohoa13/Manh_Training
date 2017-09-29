package Training;
import java.util.Scanner;
public class MangDoiXung {
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Nhap phan tu thu " + i);
			array[i] = inPut.nextInt();
		}
		boolean status = false;
		int n = array.length - 1;
		int i = 0;
		while(i < array.length/2) {
			if(array[i] == array[n - i]) {
				status = true;
			} else {
				status = false;
				break;
			}
			i ++;
		}
		if(status == true) {
			System.out.println("mang doi xung");
		} else {	
			System.out.println("mang khong doi xung");
		}
		
	}		
}
