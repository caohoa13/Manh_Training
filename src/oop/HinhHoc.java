package oop;

import java.util.Scanner;

public class HinhHoc {
	private int canh1;
	private int canh2;
	private int canh3;
	public void HinhHoc() {

	}
	Scanner inPut = new Scanner(System.in);
	public void nhapCanh1() {
		System.out.println("Nhap chieu dai cua canh 1: ");
		canh1 = inPut.nextInt();
	}
	public int getCanh1() {
		return canh1;
	}
	public void nhapCanh2() {
		System.out.println("Nhap chieu dai cua canh 2: ");
		canh2 = inPut.nextInt();
	}
	public int getCanh2() {
		return canh2;
	}
	public void nhapCanh3() {
		System.out.println("Nhap chieu dai cua canh 3: ");
		canh3 = inPut.nextInt();
	}
	public int getCanh3() {
		return canh3;
	}
}
