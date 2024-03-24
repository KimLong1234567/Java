package tesst1;

import java.util.Scanner;

public class test extends main {
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;
	
	public test() {
		super();
		dgia = 0.0f;
		sluong = 0;
		loai = 'c';
		tgia = 0.0f;
	}
	
	public test(test a) {
		super(a);
		dgia = a.dgia;
		sluong = a.sluong;
		loai = a.loai;
		tgia = a.tgia;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap don gia: ");
		dgia = sc.nextFloat();
		sc.nextLine();
		System.out.println("\n Nhap so luong: ");
		sluong = sc.nextInt();
		sc.nextLine();
		System.out.println("\n Nhap ngay giao dich: ");
		loai = sc.next().charAt(0);
		System.out.println("\n Nhap trang thai: ");
		tgia = sc.nextFloat();	
	}
	
	public void in() {
		super.in();
		
		System.out.println("\n Don gia: " + dgia);
		
		System.out.println("\n So luong: " + sluong);
		
		System.out.println("\n loai: " + loai);
		
		System.out.println("\n tgia: " + tgia);
	}
	
	public float layDgia() {
		return dgia;
	}
	
	public int layMgd () {
		return super.layMgd();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main gd = new main();
		System.out.println("\n Nhap phien giao dich:");
		gd.nhap();
		System.out.println("\n Thong tin chi tiet:");
		gd.in();
		main gd1 = new main(gd);
		System.out.println("\n Thong tin da sao chep:");
		gd1.in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap n doi tuong tien te");
		int n = sc.nextInt();
		
		main ds[] = new main[n];
		int s = 0;
		for(int i = 0; i < n; i++) {
			//System.out.println("\n Nhap doi tuong ");
			s = sc.nextInt();
			ds[i] = new main();
			System.out.println("\n Nhap doi tuong giao dich");
			ds[i].nhap();
			
		}
		
	}
}
