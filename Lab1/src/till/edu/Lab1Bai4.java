/**
 * 
 */
package till.edu;

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Nhập các hệ số a,b,c của phương trình bậc 2
		System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        //Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

	}

}
