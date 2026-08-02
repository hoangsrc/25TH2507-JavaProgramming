
public class run {

	public static void main(String[] args) {
		//Tạo mới đối tượng
		ChuNhat cn1 = new ChuNhat();
			//Tạo đối tượng cn1 dài = 10, rong = 5
		ChuNhat cn2 = new ChuNhat(20, 15);
			//Tạo đối tượng cn2 dài = 20 rong = 15
		ChuNhat hv = new ChuNhat(20, 20);
			//Tạo đối tượng hv dài = 20 rong = 20 (hình vuông)
			//Giả sử muốn lấy dữ liệu/ thuộc tính của cn1 để in ra
				double cn1_dai =  cn1.getDai();
				double cn1_rong = cn1.getRong();
				System.out.print("Hình cn1 có chiều dài là: ");
				System.out.print(cn1_dai);
				System.out.print("\nHình cn1 có chiều rộng là: "+ cn1_rong);
				
				//Thay đổi chiều dài của cn1
				cn1.setDai(50);
				cn1.setRong(30);
				System.out.print("\nSau khi thay đổi chiều dài và chiều rộng\n");
				cn1_dai =  cn1.getDai();
				cn1_rong = cn1.getRong();
				System.out.print("Hình cn1 có chiều dài là: "+ cn1_dai);
				System.out.println("\nHình cn1 có chiều rộng là: "+ cn1_rong);
				
				//Sử dụng phương thức toString
				System.out.println(cn1.toString());
				System.out.println(cn2.toString());
	}
	

}
