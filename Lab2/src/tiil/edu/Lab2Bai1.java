/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

public class Lab2Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Nhập hệ số a,b vào phương trình bậc nhất
		System.out.print("Nhập hệ số của a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số của b: ");
		double b = scanner.nextDouble();
		//Kiểm tra a,b để giải phương trình
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			double x = -b / a;
			System.out.printf("Nghiệm của phương trình x = %f\n ",x);
		}
		scanner.close();
	}
}
