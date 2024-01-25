/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

public class Lab2Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Nhap cac he so a,b,c
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		// Xét a
		if (a == 0){
			if (b == 0){
				System.out.println("Phương trình có vô số nghiệm.");
			}else {
				System.out.println("Phương trình vô nghiệm.");
			}
		}
		
		//Tính delta
		double delta = b * b - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm.");
		}else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép: " + x);
		}else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
		}

	}

}
