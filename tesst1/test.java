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
		System.out.println("\n Nhap loai giao dich: ");
		loai = sc.next().charAt(0);
		System.out.println("\n Nhap ty gia: ");
		tgia = sc.nextFloat();	
	}
	
	public float getDgia() {
		return dgia;
	}

	public void setDgia(float dgia) {
		this.dgia = dgia;
	}

	public int getSluong() {
		return sluong;
	}

	public void setSluong(int sluong) {
		this.sluong = sluong;
	}

	public char getLoai() {
		return loai;
	}

	public void setLoai(char loai) {
		this.loai = loai;
	}

	public float getTgia() {
		return tgia;
	}

	public void setTgia(float tgia) {
		this.tgia = tgia;
	}

	public void in() {
		super.in();
		
		System.out.println("\n Don gia: " + dgia);
		
		System.out.println("\n So luong: " + sluong);
		
		System.out.println("\n loai: " + loai);
		
		System.out.println("\n ty gia: " + tgia);
	}
	
	public float layDgia() {
		return dgia;
	}
	
	public int layMgd () {
		return super.layMgd();
	}
	
    public float tien() {
        return sluong * dgia * tgia; // Sửa tên biến thành tigia
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
        System.out.println("\n Nhap so luong doi tuong tien te:");
        int n = sc.nextInt();

        test ds[] = new test[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new test();
            System.out.println("\n Nhap doi tuong giao dich tien te");
            ds[i].nhap();
        }

		System.out.println("\nCac ma so giao dich tien te co gia tri tren 100.000 VNĐ:");
		for (int i = 0; i < n; i++) {
		    if (ds[i] instanceof test && ((test)ds[i]).tien() > 100000) {
		        System.out.println(ds[i].layMgd());
		    }
		}
		 // Thống kê số tiền của các giao dịch tiền tệ theo tháng-năm
        float totalMoney = 0.0f;
        System.out.println("\nThong ke so tien cua cac giao dich tien te theo thang-nam:");
        for (int i = 0; i < n; i++) {
            totalMoney += ((test)ds[i]).tien();
        }
        System.out.println("Tong so tien: " + totalMoney + " VNĐ");
		
	}
}
