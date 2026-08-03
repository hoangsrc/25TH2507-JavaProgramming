package ntu.minhhoangg;

public class KhoiLapPhuong {
	//
	double canh;
	
	//Hàm tạo
	public KhoiLapPhuong(double canh) {
		this.canh = canh;
	}

	//Getter và Setter
	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
	}
	
	//Xử lý
	public double getTinhTheTich() {
		return Math.pow(canh, 3);
	}
}
