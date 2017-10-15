package Training;

import java.util.Scanner;

public class InSao {
	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);
		int i, j, r;
		System.out.println("enter r: ");
		r = inPut.nextInt();
		for(i = 0; i < r; i ++) {
			for(j = r; j > i; j --) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	 private void Sysout() {
		// TODO Auto-generated method stub
		 //ahihi
	}

}
