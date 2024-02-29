/**
 * 
 */
package tiil.edu;


class SanPham {
	public String tenSp; 
	public double donGia;
	public double giamGia;

	public SanPham() {

	}
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public double getThueNhapKhau() {
		return 1/10 * donGia;
	}
}
public class Lab4Bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
