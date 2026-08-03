package ntu.minhhoangg;

public class HocVien {
	
	//Khai báo
	private String maHV, fullName, gioiTinh;
	private int namSinh;
	
	//Hàm tạo
	public HocVien(String maHV, String fullName, String gioiTinh, int namSinh) {
		this.maHV 		= maHV;
		this.fullName	= fullName;
		this.gioiTinh 	= gioiTinh;
		this.namSinh 	= namSinh;
	}
	//Tạo Getter và Setter cho HovVien
	public String getMaHV() {
		return maHV;
	}
//
	public void setMaHV(String maHV) {
		this.maHV = maHV;
	}
//
	public String getFullName() {
		return fullName;
	}
//
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
//
	public String getGioiTinh() {
		return gioiTinh;
	}
//
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
//
	public int getNamSinh() {
		return namSinh;
	}
//
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	
	
	
}
