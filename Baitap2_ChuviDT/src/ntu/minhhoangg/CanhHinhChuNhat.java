package ntu.minhhoangg;

public class CanhHinhChuNhat {
	//Khai báo các thuộc tính
	private double canh1;
	private double canh2;
	//Hàm tạo
	public CanhHinhChuNhat(double canh1, double canh2) {
		this.canh1 = canh1;
		this.canh2 = canh2;
	}
	//Getter và Setter cho canh1 và canh2
	//canh1
	public double getCanh1() {
		return canh1;
	}
	public void setCanh1(double canh1) {
		this.canh1 = canh1;
	}
	//canh2
	public double getCanh2() {
		return canh2;
	}
	public void setCanh2(double canh2) {
		this.canh2 = canh2;
	}
	//Xử lý
	
	//Tính chu vi
	 public double getTinhChuVi() {
		return (canh1 + canh2) * 2;
	}
	
	//Tính diện tích
	public double getTinhDienTich() {
		return canh1 * canh2;
	}

	// Tìm cạnh nhỏ
		public double getTimCanhNho() {
			return Math.min(canh1, canh2);
		}
}
		