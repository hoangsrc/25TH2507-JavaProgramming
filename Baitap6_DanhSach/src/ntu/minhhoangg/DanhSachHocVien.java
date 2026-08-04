package ntu.minhhoangg;

import java.util.ArrayList;

public class DanhSachHocVien {

	public static void main(String[] args) {
		////Khai báo biến danh sách để chứa các số nguyên
		ArrayList<HocVien> dsHocVien = new ArrayList<HocVien>();

		//Tạo 3 học viên và thêm vào danh sách
		//Tạo học viên
		HocVien hv1 = new HocVien("HV01", "Nguyễn Văn An", "Nam", 2003);
		HocVien hv2 = new HocVien("HV02", "Trần Thị Bình", "Nữ", 2001);
		HocVien hv3 = new HocVien("HV03", "Lê Hoàng Cường", "Nam", 2005);
		
		//THêm học viên vào danh sách
		dsHocVien.add(hv1);
		dsHocVien.add(hv2);
		dsHocVien.add(hv3);
		
		//In học viên ra từ danh sách
		System.out.println("Học viên có trong danh sách");
		for( HocVien x : dsHocVien) {
		
//			System.out.print(x + " ");
			System.out.println("\nMã HV: " + x.getMaHV());
			System.out.println("Họ tên: " + x.getFullName());
			System.out.println("Giới tính: " + x.getGioiTinh());
			System.out.println("Năm sinh: " + x.getNamSinh());
		}
		
		//Thực hiện xử lý để tìm người lớn tuổi nhất
		
		
	}

}
