import java.util.Scanner;

public class TongHaiSo {

	public static void main(String[] args) {
		//Khai báo
		double num1, num2, sum;
		
		//khai báo đối tượng Scanner
		Scanner banPhim = new Scanner(System.in);
		
		//In ra thông tin mời User nhập số thứ nhất
		System.out.print("Mời nhập số thứ nhất: ");
			num1 = banPhim.nextDouble();

		System.out.print("Mời nhập số thứ hai: ");
		num2 = banPhim.nextDouble();
		
		//Tính toán
		sum = num1 + num2;
		
		//In ra thông tin dữ liệu được người dùng nhập sau khi mà đã tính toán
		System.out.print("Tổng của " + num1 + " và " + num2 + " là\n" + num1 + " + " + num2 +" = " +sum);
		
		
	}

}
