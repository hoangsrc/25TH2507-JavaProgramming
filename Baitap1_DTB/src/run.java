import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//Khai báo
		
				double DTB;
				String HoTen;
				
				//khai báo đối tượng Scanner
				Scanner banPhim = new Scanner(System.in);
				
				
				//In ra thông tin mời User nhập họ tên và điểm trung bình từ bàn phím và xử lý thông tin
				//Nhập Họ và tên
				System.out.print("Mời nhập Họ và tên sinh viên từ bàn phím: ");
					do {
						HoTen = banPhim.nextLine();
						if (HoTen.trim().isEmpty()) {	
							System.out.print("Lỗi: Họ và tên không được để trống\nVui lòng nhập lại: ");
						}else if (HoTen.matches(".*\\d.*")) {
							System.out.print("Lỗi: Họ và tên không được chứa chữ số\nVui lòng nhập lại: ");
						}else {
							break;
						}
					} while (true);//while true làm cho vòng lặp cứ chạy cho tới khi gặp break;
					
				//Nhập điểm trung bình
				System.out.print("Mời nhập điểm trung bình từ bàn phím: ");
				do {
				    if (banPhim.hasNextDouble()) {
				        DTB = banPhim.nextDouble();
				        if (DTB >= 0 && DTB <= 10) {
				            break;
				        } else {
				            System.out.print("Lỗi: Điểm phải nằm trong khoảng từ 0 đến 10\nVui lòng nhập lại: ");
				        }
				    } else {
				        // Nếu người dùng nhập chữ
				        System.out.println("Lỗi: Điểm phải là một chữ số!");
				        banPhim.next(); // Đọc bỏ giá trị chữ vừa nhập
				    }
				} while (true);
				//In ra màn hình thông tin đã nhập từ bàn phím
					System.out.println("Họ tên sinh viên: "+HoTen);
					System.out.println("Điểm trung bình "+DTB);

	}

}
