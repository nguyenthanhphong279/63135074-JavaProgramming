/**
 * 
 */
package tiil.edu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Lab5Bai1 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Double> list = new ArrayList<>();

	        System.out.println("Nhập danh sách số thực");
	        while (true) {
	            Double x = scanner.nextDouble();
	            list.add(x);
	            System.out.print("Nhập thêm (Y/N)? (Y tiếp tục / N dừng lại) ");
	            scanner.nextLine();
	            if (scanner.nextLine().equals("N")) {
	                break;
	            }
	        }
	        System.out.println("Danh sách số thực vừa nhập:");
	        for (Double x : list) {
	            System.out.println(x);
	        }
	        double tong = 0;
	        for (Double x : list) {
	            tong += x;
	        }
	        System.out.println("Tổng của danh sách: " + tong);
	    }
}
