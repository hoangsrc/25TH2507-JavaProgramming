package ntu.minhhoangg;

import java.util.ArrayList;
import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//Khai báo biến danh sách để chứa các số nguyên
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		
		//Nhập 10 phần tử từ bàn phím
		Scanner banPhim = new Scanner(System.in);
	for(int i = 0; i < 10; i++) {
		//Để nhập 1 phần tử
		
			//In một hướng đẫn cho người dùng
		System.out.print("Mời nhập phần thứ "+i+": ");
		
			//Cho user nhập
		Integer tam = banPhim.nextInt();
		
			//Thêm vào cuối danh sách
		dsSoNguyen.add(tam);
	}
		
		//In ra danh sách vừa được nhập
//		System.out.print("Danh sách vừa được nhập là: ");
//		for (int i = 0; i<dsSoNguyen.size(); i++) {
//			
//			//Lấy giá trị phần tử ở vị trí i
//			Integer tam = dsSoNguyen.get(i);
//			System.out.print(tam + " ");
//		}
		//Mỗi một phần tử x có kiểu dữ liệu là Integer, trong danh sách các phần tử số nguyên này
		for( Integer x: dsSoNguyen) {
			System.out.print(x + " ");
		}
	}

}
