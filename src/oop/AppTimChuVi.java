package oop;

import java.util.Scanner;

public class AppTimChuVi {
	public static void main(String[] args) {
		int hinh;
		Scanner inPut = new Scanner(System.in);
		System.out.println("Nhap hinh ban muon tim chu vi (1: Hinh Vuong, 2: Hinh Tam Giac, 3: Hinh Chu Nhat): ");
		hinh = inPut.nextInt();
		HinhHoc hinhABC = new HinhHoc();
		switch(hinh) {
		case 1:
			hinhABC.nhapCanh1();
			System.out.print("Chu vi hinh vuong la: ");
			System.out.println(hinhABC.getCanh1() * 4);
			break;
		case 2:
			hinhABC.nhapCanh1();
			hinhABC.nhapCanh2();
			hinhABC.nhapCanh3();
			System.out.print("Chu vi hinh tam giac la: ");
			System.out.println(hinhABC.getCanh1() + hinhABC.getCanh2() + hinhABC.getCanh3());
			break;
		case 3:
			hinhABC.nhapCanh1();
			hinhABC.nhapCanh2();
			System.out.print("Chu vi hinh chu nhat la: ");
			System.out.println(hinhABC.getCanh1() * hinhABC.getCanh2());
			break;
		}
	}
}
