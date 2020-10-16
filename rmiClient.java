package bai2;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class rmiClient {
	public static void main(String[] args) {
		try {
			searchbook sb = (searchbook) Naming.lookup("rmi://localhost:5000/searchbook");
			if(sb.search(args[0])) {
				System.out.println("Tim thay");
			}else
				System.out.println("Khong tim thay");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
