package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/**
		 * thong tin sinh vien1
		 */
		String ten = sc.nextLine();
		System.out.println("Thong tin sinh vien 1 ");
		String msv = "21602166";
		System.out.println("Ho va ten: " + ten);
		String Id = sc.nextLine();
		
		System.out.println("Ma sinh vien: " + Id);
		
		String nameSchool = sc.nextLine();
	
		System.out.println("Ten truong: " + nameSchool);
	
		
		
		
		/**
		 * thong tin sinh vien2
		 */
		
		
		System.out.println("Thong tin sinh vien 2 ");
		String hoten = sc.nextLine();
		System.out.println("Ho va ten: " + hoten);
		String msv1 = sc.nextLine();
		System.out.println("Ma sinh vien: " + msv1);
		String truong = sc.nextLine();
		System.out.println("Ten Truong: " + truong);
		
		/**
		 * thong tin cong nhan 
		 */
		
		
		
		System.out.println("Thong tin cong nhan");
		String fullName = sc.nextLine();
		System.out.println("Ho va ten: " + fullName);
		String diachi = sc.nextLine();
		System.out.println("Dia chi: " + diachi);
		int sdt = sc.nextInt();
		System.out.println("So dien thoai: " + sdt);
		float hsl = sc.nextFloat();
		System.out.println("Luong: " + hsl);
		/**
		 * thong tin xe car
		 */
	
		System.out.println("Thong tin chiec xe car");
		String tenxe = sc.nextLine();
		System.out.println("Ten xe: " + tenxe);
		String hang = sc.nextLine();
		System.out.println("Hang xe: " + hang);
		float gia = sc.nextFloat();
		System.out.println("Gia xe: " + gia);
		String mauxe = sc.nextLine();
		System.out.println("Mauxe: " + mauxe);
		
		
		
		
		
		
	}

}
