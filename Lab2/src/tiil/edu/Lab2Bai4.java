/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class Lab2Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.print("Lựa chọn chức năng bạn muốn thực hiện (1-4): ");
            choice = scanner.nextInt();
            
            switch(choice) {
            case 1:
                giaiPTBacNhat();
                break;
            case 2:
                giaiPTBacHai();
                break;
            case 3:
                tinhTienDien();
                break;
            case 4:
                System.out.println("Kết thúc ứng dụng. Cảm ơn quý khách!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn (1-4)!");
            }
		}while (choice != 4);
	}
	public static void giaiPTBacNhat() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
	}
    public static void giaiPTBacHai() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        }
    }
    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        
        double tienDien = 0;
        
        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }
        
        System.out.println("Tiền điện phải thanh toán: " + tienDien + " VND");
    }
}
