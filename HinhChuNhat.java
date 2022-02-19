package baiTap1;

import com.sun.java_cup.internal.runtime.Scanner;
import java.util.Scanner;
public class HinhChuNhat {
	double chieuDai;
	double chieuRong;
	
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		if (chieuDai > 0)
			this.chieuDai = chieuDai;
		else 
			System.out.println("Loi chieu dai!");
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		if (chieuRong > 0)
			this.chieuRong = chieuRong;
		else 
			System.out.println("Loi chieu rong!");
	}

	public HinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public double getDienTich() {
		return chieuDai*chieuRong;
	}
	
	public double getChuVi() {
		return (chieuDai + chieuRong)*2;
	}
	 
	public HinhChuNhat() {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HinhChuNhat hcn = new HinhChuNhat();
		System.out.println("Nhap chieu dai: ");
		double d = sc.nextDouble();
		System.out.println("Nhap chieu rong:");
		double r = sc.nextDouble();
		hcn.setChieuDai(d);
		hcn.setChieuRong(r);
		System.out.println("Dien tich: " + hcn.getDienTich());
		System.out.println("Chu vi: " + hcn.getChuVi());
	}
}
