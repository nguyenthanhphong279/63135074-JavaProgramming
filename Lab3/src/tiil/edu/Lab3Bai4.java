/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class Lab3Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();
		
		String[] hoTen = new String[n];
		double[] diem = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
			System.out.print("Họ và tên: ");
			scanner.nextLine();
			hoTen[i] = scanner.nextLine();
			
			System.out.print("Điểm: ");
			diem[i] = scanner.nextDouble();
		}
		System.out.println("\nDanh sách sinh viên:");
		for (int i = 0; i < n; i++) {
			System.out.println("Sinh viên " + (i + 1) + ":");
			System.out.println("Họ và tên: " + hoTen[i]);
			System.out.println("Điểm: " + diem[i]);
			System.out.println("Học lực: " + xetHocLuc(diem[i]));
			System.out.println();
		}
		//Phương thức sắp xếp danh sách sinh viên theo điểm
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (diem[j] > diem[j + 1]) {
					double tempDiem = diem[j];
					diem[j] = diem[j + 1];
					diem[j + 1] = tempDiem;
					
					String tempHoTen = hoTen[j];
					hoTen[j] = hoTen[j + 1];
					hoTen[j + 1] = tempHoTen;
				}
			}
		}
		//Xuat danh sách
		System.out.println("\nDanh sách sinh viên mà điểm được sắp xếp theo thứ tự tăng dần:");
		for (int i = 0; i < n; i++) {
			System.out.println("Sinh viên " + (i + 1) + ": " + hoTen[i] + ", Điểm: " + diem[i]);
		}
	}
	//Phương thức xét học lực
	public static String xetHocLuc(double diem) {
		if (diem < 5) {
			return "Yếu";
		}else if (diem < 6.5) {
			return "Trung bình";
		}else if (diem < 7.5) {
			return "Khá";
		}else if (diem < 9) {
			return "Giỏi";
		}else {
			return "Xuất sắc";
		}
	}

}
