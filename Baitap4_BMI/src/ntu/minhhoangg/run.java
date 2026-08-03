package ntu.minhhoangg;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo
		double ChieuCao = 0, CanNang = 0, BMI;
		
		//Khai báo Scanner
		Scanner banPhim = new Scanner(System.in);
		
		//In ra thông tin yêu cầu User nhập vào cân nặng và chiều cao
		System.out.println("Xin mời nhập vào cân nặng và chiều cao");
		do {
			System.out.print("Chiều cao (cm): ");
		    if (banPhim.hasNextDouble()) {
		        ChieuCao = banPhim.nextDouble();
			        if (ChieuCao <= 0) {
			            System.out.println("Lỗi: giá trị không được âm\n");
			        } else  {
			        	break;
			        }
		    } else {
		        System.out.println("Lỗi: giá trị phải là chữ số\n");
		        banPhim.next();
		    }
		}while(ChieuCao <=0 );	

		do {
			
			System.out.print("Cân nặng (kg): ");
		    if (banPhim.hasNextDouble()) {
		        CanNang = banPhim.nextDouble();
			        if (CanNang<= 0) {
			            System.out.println("Lỗi: giá trị không được âm\n");
			        } else  {
			        	break;
			        }
		    } else {
		        System.out.println("Lỗi: giá trị phải là chữ số\n");
		        banPhim.next();
		    }
		}while(CanNang <=0 );	
		
		//Xử lý
		//Đổi chiều cao từ cm sang m
		double ChieuCaoM = ChieuCao / 100.0;
		
		//Tính chỉ số BMI theo tiêu chuẩn của Châu Á là 18.5
		BMI = CanNang / (ChieuCaoM * ChieuCaoM);
		System.out.println("Chỉ số BMI theo chiều cao và cân nặng vừa nhập: "+BMI);
		//
		String tinhTrang = "";
		if (BMI < 18.5) {
			tinhTrang = "Thiếu cân (Gầy)";
		} else if (BMI <= 22.9) {
			tinhTrang = "Bình thường";
		} else if (BMI <= 24.9) {
			tinhTrang = "Thừa cân (Tiền béo phì)";
		} else if (BMI <= 29.9) {
			tinhTrang = "Béo phì độ I";
		} else {
			tinhTrang = "Béo phì độ II";
		}
		
		System.out.print("Tình trạng đánh giá theo BMI tiêu chuẩn của Châu á: "+tinhTrang);
	}

}
