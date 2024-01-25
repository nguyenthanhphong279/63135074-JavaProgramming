/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

public class Lab2Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số điện sử dụng trong tháng: ");
		int soDien = scanner.nextInt();
		
		double tienDien = 0;
		
		if (soDien <= 50) {
			tienDien = soDien * 1000;
		}
		else {
			tienDien = 50 * 1000 + (soDien - 50) * 1200;
		}
		System.out.println("Tiền điện phải thanh toán: " + tienDien + " VND");
	}
}
