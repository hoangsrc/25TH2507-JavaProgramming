package ntu.minhhoangg;

import java.util.Scanner;

public class run_HocVien {

	public static void main(String[] args) {
		//KHai báo
		String maHV, fullName, gioiTinh;
		int namSinh = 0;
		
		//Khai báo Scanner
		Scanner banPhim = new Scanner(System.in);

		//In ra yêu cầu học viên nhập vào các thông tin
		System.out.println("Vui lòng nhập vào thông tin được yêu cầu: ");
		
		//Nhập mã HV
		System.out.print("Mã học viên: ");
		maHV = banPhim.nextLine();
		
		//Nhập họ và tên
		System.out.print("Họ và tên: ");
		do {
			fullName = banPhim.nextLine();
			if (fullName.trim().isEmpty()) {	
				System.out.print("Lỗi: Họ và tên không được để trống\nVui lòng nhập lại: ");
			}else if (fullName.matches(".*\\d.*")) {
				System.out.print("Lỗi: Họ và tên không được chứa chữ số\nVui lòng nhập lại: ");
			}else {
				break;
			}
		} while (true);
		
		//Nhập giới tính
		System.out.print("Giới tính (Nam/ Nữ): ");
		gioiTinh = banPhim.nextLine();
		
		//Nhập năm sinh
		do {
			System.out.print("Năm sinh: ");
			if (banPhim.hasNextInt()) {
				namSinh = banPhim.nextInt();
				banPhim.nextLine(); // Đọc bỏ phím Enter còn đọng trong bộ nhớ đệm
				if (namSinh <= 1900 || namSinh > 2026) {
					System.out.println("Lỗi: Năm sinh không hợp lệ!\n");
				} else {
					break;
				}
			} else {
				System.out.println("Lỗi: Năm sinh phải là số nguyên!\n");
				banPhim.next(); // Đọc bỏ dữ liệu chữ không hợp lệ
			}
		} while (true);
			
		//Khởi tạo đối tượng HocVien từ thông tin vừa nhập
		
		//In ra thông tin đã được nhập
		System.out.println("\nThông tin viên nhập của hội viên: "+ fullName);
//		System.out.println("Học viên: "+ fullName);
		System.out.println("Mã số học viên: "+ maHV);
		System.out.println("Giới tính: "+ gioiTinh);
		System.out.println("Sinh năm: "+ namSinh);
	}
}


