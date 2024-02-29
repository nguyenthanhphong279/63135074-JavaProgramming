/**
 * 
 */
package Lab4Bai4;

import java.util.Scanner;

/**
 * 
 */
class SanPham {
	private String tenSp; 
	private double donGia;
	private double giamGia;
	
	public String getTenSp(){
		return this.tenSp;
	}
	public void setTenSp(String tenSp){
		this.tenSp = tenSp;
	}
	public double getdonGia() {
		return this.donGia;
	}
	public void setdonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getgiamGia() {
		return this.giamGia;
	}
	public void setgiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	public SanPham() {
		
	}
	public SanPham(String tenSp, double donGia) {
		this(tenSp, donGia, 0);
	}
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	private double getThueNhapKhau() {
		return 0.1 * donGia;
	}
	
	public void xuat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
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
public class Lab4Bai4 {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		SanPham sp3 = new SanPham("A", 20000, 10000);
		SanPham sp4 = new SanPham("B", 20000);
		System.out.println("Nhập vào thông tin sản phẩm 1: ");
		sp1.nhap();
		System.out.println("Nhập vào thông tin sản phẩm 2: ");
		sp2.nhap();
		System.out.println("Sản phẩm 1: ");
		sp1.xuat();
		System.out.println("Sản phẩm 2: ");
		sp2.xuat();
		System.out.println("Sản phẩm 3: ");
		sp3.xuat();
		System.out.println("Sản phẩm 4: ");
		sp4.xuat();

	}

}
