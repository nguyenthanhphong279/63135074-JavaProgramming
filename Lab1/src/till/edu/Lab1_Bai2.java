/**
 * 
 */
package till.edu;

import java.util.Scanner;

/**
 * 
 */
public class Lab1_Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Nhập vào chiều dài và chiều rộng của hình chữ nhật
		System.out.print("Nhập vào chiều dài của HCN: ");
		double dai = scanner.nextDouble();
		System.out.print("Nhập vào chiều rộng của HCN: ");
		double rong = scanner.nextDouble();
		//Tính chu vi, diện tích và cạnh nhỏ nhất
		double chuVi = (dai + rong) * 2;
		double dienTich = dai * rong;
		double canhNhoNhat = Math.min(dai, rong);
		//Xuất kết quả chu vi, diện tích, cạnh nhỏ nhất
		System.out.printf("Chu vi: %.2f\n", chuVi);
		System.out.printf("Diện tích: %.2f\n", dienTich);
		System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNhoNhat);
		scanner.close();
		
	}

}
