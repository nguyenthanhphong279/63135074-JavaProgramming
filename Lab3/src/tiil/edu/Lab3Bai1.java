/**
 * 
 */
package tiil.edu;

import java.util.Scanner;


public class Lab3Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số của bạn: ");
		int N = scanner.nextInt();
		
		boolean ok = true;
		for (int i = 2; i < N - 1; i++) { //N là số nhập từ phím
			if (N % i == 0) {
				ok = false; 
				break; 
			}
			i++;
		}
		if (N <= 1) {
			ok = false;
		}
		if (ok) {
			System.out.println("Đây là số nguyên tố.");
		}else {
			System.out.println("Đây không phải là số nguyên tố.");
		}
	}
}
