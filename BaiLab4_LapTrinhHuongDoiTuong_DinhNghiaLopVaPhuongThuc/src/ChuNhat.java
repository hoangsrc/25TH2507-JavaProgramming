
public class ChuNhat {
	//Khai báo các thuộc tính
	private double dai;
	private double rong;
	//Hàm tạo
	public ChuNhat() {
		dai = 10; rong = 5;
	}
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong= rong;
	}
	
	//Getter và Setter cho dài và rộng
	/*--------------Dai--------------*/
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	/*--------------Rong-------------*/
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}


}
