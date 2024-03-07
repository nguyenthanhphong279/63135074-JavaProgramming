/**
 * 
 */
package tiil.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */
public class Lab5Bai2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu(list, scanner);

	}
	
	public static void menu(ArrayList<String> list, Scanner scanner) {
		nhap(list, scanner);
		System.out.println("Danh sách họ tên:");
		xuat(list);
		ngaunhien(list);
		sapxep(list);
		xoa(list,scanner);
	}
	public static void nhap(ArrayList<String> list, Scanner scanner) {
		System.out.println("Nhập danh sách họ và tên (Nhập 'END' để kết thúc):");
        scanner.nextLine(); // Đọc bỏ dòng thừa
        while (true) {
            String hoTen = scanner.nextLine();
            if (hoTen.equals("END")) {
                break;
            }
            list.add(hoTen);
        }
	}
	
	public static void xuat(ArrayList<String> list) {
        for (String hoTen : list) {
            System.out.println(hoTen);
        }
    }
	
	public static void ngaunhien(ArrayList<String> list) {
        Collections.shuffle(list);
        System.out.println("Danh sách họ tên ngẫu nhiên:");
        xuat(list);
    }
	
	public static void sapxep(ArrayList<String> list) {
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("Danh sách họ tên sau khi sắp xếp giảm dần:");
		xuat(list);
	}
	
	private static void xoa(ArrayList<String> list, Scanner scanner) {
        System.out.print("Nhập họ tên cần xóa: ");
        String xoaTen = scanner.next();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(xoaTen)) {
                list.remove(i);
                break;
            }
        }
        System.out.println("Danh sách họ tên sau khi xóa:");
        xuat(list);
    }

}
