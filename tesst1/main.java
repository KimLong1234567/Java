package tesst1;

import java.util.Scanner;

public class main {
	private int mgd;
	private String hten;
	private String ngay;
	private boolean tthai;
	
	public main() {
		mgd = 0;
		hten = new String();
		ngay = new String();
		tthai = true;
	}
	
	public main(main a) {
		mgd = a.mgd;
		hten = new String(a.hten);
		ngay = new String(a.ngay);
		tthai = a.tthai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap ma so giao dich: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.println("\n Nhap ho ten nguoi giao dich: ");
		hten = sc.nextLine();
		System.out.println("\n Nhap ngay giao dich: ");
		ngay = sc.nextLine();
		System.out.println("\n Nhap trang thai: ");
		tthai = sc.nextBoolean();	
	}
	
	public void in() {
		System.out.println("\n Ma so giao dich: " + mgd);
		
		System.out.println("\n Ten nguoi giao dich: " + hten);
		
		System.out.println("\n ngay giao dich: " + ngay);
		
		System.out.println("\n Trang thái: " + tthai);
	}
	
	public int layMgd() {
		return mgd;
	}

	public String layHten() {
		return hten;
	}
	
	public String layNgay() {
		return ngay;
	}

	public boolean layTthai() {
		return tthai;
	}

}
