package lab5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		try {
			Quanlychuyenbay ql = new Quanly();
			Naming.rebind("rmi://localhost:1017/Quanlychuyenbay", ql);
			System.out.println("Server da san sang");
			Scanner in = new Scanner(System.in);
			ql.taocb();
			while (true) {
				System.out.println("Cac Lua Chon:\n" 
						+ "1. Xem thong tin chuyen bay\n" 
						+ "2. Them chuyen bay\n"
						+ "3. Xoa chuyen bay\n");
				switch (in.nextLine()) {
				case "1":
					System.out.println(ql.xem());
					break;
				case "2":
					Chuyenbay cb=new Chuyenbay();
					System.out.println("Nhap so hieu chuyen bay: ");
					cb.setSh(in.nextLine());
					System.out.println("Nhap ngay bay: ");
					cb.setNbay(in.nextLine());
					System.out.println("Nhap noi di: ");
					cb.setNdi(in.nextLine());
					System.out.println("Nhap noi den: ");
					cb.setNden(in.nextLine());
					System.out.println("Nhap thoi gian bay: ");
					cb.setTg(in.nextLine());
					System.out.println("Nhap so ghe: ");
					cb.setG(in.nextInt());
					in.nextLine();
					cb.setGban(0);
					cb.setGtrong(0);
					if (ql.themcb(cb))
						System.out.println("Them thanh cong");
					else
						System.out.println("Them that bai");
					break;
				case "3":
					System.out.println("Nhap so hieu chuyen bay muon xoa: ");
					String shx = in.nextLine();
					if (ql.xoacb(shx))
						System.out.println("Xoa thanh cong");
					else
						System.out.println("Xoa that bai");
					break;
				default:
					System.out.println("Lua chon ko phu hop");
					break;
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}