package bai2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Paths;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class searchbookImpl extends UnicastRemoteObject implements searchbook {

	private static final long serialVersionUID = 1L;
	protected searchbookImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean search(String name) throws RemoteException, IOException {
		Scanner sc = new Scanner(Paths.get("sach.txt"), "UTF-8");
		while (sc.hasNextLine()) {
			String ip = sc.nextLine();
			if (ip.equalsIgnoreCase(name)) {
				return true;
			}
		}
		sc.close();
		return false;
	}
	public static void main(String[] args) {
		try {
			Naming.rebind("rmi://localhost:5000/searchbook", new searchbookImpl());
			System.out.println("Server da san sang");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}