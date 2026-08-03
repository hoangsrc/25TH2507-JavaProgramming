package ntu.minhhoang;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//khai báo đối tượng Scanner
		Scanner banPhim = new Scanner(System.in);
		
		double c1 = 0;
		double c2 = 0;
		
		//Nhập 2 cạnh hình chữ nhật
		//cạnh 1
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
		}while(c1 <=0 );

		//cạnh 2
		do {
			System.out.print("Nhập cạnh 2: ");
		    if (banPhim.hasNextDouble()) {
		        c2 = banPhim.nextDouble();
		        if (c2 < 0) {
		            System.out.println("Lỗi: giá trị không được âm");
		        } else  {
		        	break;
		        }
		    } else {
		        // Nếu người dùng nhập chữ
		        System.out.println("Lỗi: giá trị phải là chữ số!");
		        banPhim.next();
		    }
		}while(c2 <=0 );

		//Tạo đối tượng mới
		CanhHinhChuNhat hcn = new CanhHinhChuNhat(c1, c2);
		
		System.out.println("Chu vi của hình chữ nhật là: " + hcn.getTinhChuVi());
		System.out.println("Diện tích của hình chữ nhật là: " + hcn.getTinhDienTich());
		System.out.println("Cạnh nhỏ của hình chữ nhật là: " + hcn.getTimCanhNho());
		
	}

}
