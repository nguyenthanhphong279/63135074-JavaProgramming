/**
 * 
 */
package Lab4Bai2;

import java.util.Scanner;

class SanPham {
	public String tenSp; 
	public double donGia;
	public double giamGia;

	public SanPham() {

	}
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public double getThueNhapKhau() {
		return 1/10 * donGia;
	}

	public void xuat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.printf("Thuế nhập khẩu: " , getThueNhapKhau());
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào tên sản phẩm: ");
		tenSp = scanner.next();
		System.out.print("Nhập vào đơn giá: ");
		donGia = scanner.nextDouble();
		System.out.print("Nhập vào giảm giá: ");
		giamGia = scanner.nextDouble();	
	}
}
public class Lab4Bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp2.xuat();

	}

}
