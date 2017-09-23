package Training;
import java.util.Scanner;
public class TimX {
	public static void main(String[] args) {
		int x, i;
		int[] Array = { 2, 6, 9, 4, 3, 5 };
		boolean value = false;
		Scanner inPut = new Scanner(System.in);
		System.out.println("Nhap x: ");
		x = inPut.nextInt();
		for (i = 0; i < Array.length; i++) {
			if (x == Array[i]) {
				value = true;
				break;
			} 
		}
		if (value == true) {
			System.out.println("x ton tai trong mang");
			System.out.println("vi tri cua x la: " + i);
		} else {
			System.out.println("x khong ton tai trong mang");
		}
	}

}


