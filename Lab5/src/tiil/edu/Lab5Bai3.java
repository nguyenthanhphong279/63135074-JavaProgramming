/**
 * 
 */
package tiil.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 
 */
public class Lab5Bai3 {
	static class SanPham{
		String ten;
		Double gia;
		
		public SanPham(String ten, Double gia) {
			this.ten = ten;
			this.gia = gia;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		menu(list, scanner);
	}
	
	public static void menu(ArrayList<SanPham> list, Scanner scanner) {
		nhap(list, scanner);
		sapxep(list);
		xoa(list, scanner);
		giatrungbinh(list);
	}
	
	public static void nhap(ArrayList<SanPham> list, Scanner scanner) {
		System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm thứ " + (i + 1) + ": ");
            Double gia = scanner.nextDouble();
            scanner.nextLine();
            
            SanPham sp = new SanPham(ten, gia);
            list.add(sp);
        }
	}
	
	public static void xuat(ArrayList<SanPham> list) {
		System.out.println("DANH SÁCH SẢN PHẨM: ");
        for (SanPham sp : list) {
            System.out.println("Tên sản phẩm: " + sp.ten);
            System.out.println("Giá sản phẩm: " + sp.gia);
        }
    }
	
	public static void sapxep(ArrayList<SanPham> list) {
		Comparator<SanPham> comp = new Comparator<SanPham>() {
			@Override
			public int compare(SanPham s1, SanPham s2) {
				return s1.gia.compareTo(s2.gia);
			}
		};
		Collections.sort(list, comp);
		Collections.reverse(list);
		xuat(list);
	}
	
	public static void xoa(ArrayList<SanPham> list, Scanner scanner) {
        System.out.print("Nhập tên sản phẩm bạn muốn xóa: ");
        String xoaSP = scanner.next();
        
        for (int i = 0; i < list.size(); i++) {
        	SanPham sp = list.get(i);
            if (sp.ten.equals(xoaSP)) {
                list.remove(i);
                break;
            }
        }
        xuat(list);
    }
	
	public static void giatrungbinh(ArrayList<SanPham> list) {
		double tong = 0;
		for(SanPham sp : list) {
			tong += sp.gia;
		}
		double giatrungbinh = tong / list.size();
		System.out.println("Giá TB của các sản phẩm là: " + giatrungbinh);
	}
}
