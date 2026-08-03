package ntu.minhhoangg;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//Khai báo Scanner
		Scanner banPhim = new Scanner(System.in);
		
		
		
		System.out.print("Vui lòng nhập vào 2 cạnh của hình chữ nhật từ bàn phím\n");
		do {
			System.out.print("Nhập cạnh 1: ");
		    if (banPhim.hasNextDouble()) {
		        c1 = banPhim.nextDouble();
		        if (c1 <= 0) {
		            System.out.println("Lỗi: giá trị không được âm\n");
		        } else  {
		        	break;
		        }
		    } else {
		        // Nếu người dùng nhập chữ
		        System.out.println("Lỗi: giá trị phải là chữ số\n");
		        banPhim.next();
		    }
	}

}
