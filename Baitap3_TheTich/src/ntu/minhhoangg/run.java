package ntu.minhhoangg;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//Khai báo Scanner
		Scanner banPhim = new Scanner(System.in);
		
		double canh = 0;
		//Nhập cạnh hình lập phương

		System.out.print("Vui lòng nhập vào cạnh của hình lập phương từ bàn phím\n");
		do {
			System.out.print("Nhập cạnh: ");
		    if (banPhim.hasNextDouble()) {
		        canh = banPhim.nextDouble();
			        if (canh <= 0) {
			            System.out.println("Lỗi: giá trị không được âm\n");
			        } else  {
			        	break;
			        }
		    } else {
		        System.out.println("Lỗi: giá trị phải là chữ số\n");
		        banPhim.next();
		    }
		}while(canh <=0 );	

		KhoiLapPhuong KLP = new KhoiLapPhuong(canh);
		
		//In ra kết quả đã nhập và thể tích đã tính toán
		System.out.println("Cạnh của của khối lập phương là: "+KLP.getCanh());
		System.out.println("Thể tích của khối lập phương là: "+KLP.getTinhTheTich());
	}
}
