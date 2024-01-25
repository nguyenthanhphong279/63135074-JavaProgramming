/**
 * 
 */
package till.edu;

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Nhập vào cạnh của khối lập phương
		System.out.print("Nhập vào cạnh của khối lập phương: ");
		double canh = scanner.nextDouble();
		//Tính thể tích của khối lập phương
		double theTich = canh * canh * canh;
		//double theTich = Math.pow(canh, 3);
		System.out.printf("Thể tích của khối lập phương: %f\n", theTich);
		scanner.close();	

	}

}
