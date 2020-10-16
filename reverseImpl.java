package bai5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class reverseImpl extends UnicastRemoteObject implements reverse{

	protected reverseImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String reverse(String word) throws RemoteException {
		String r = new StringBuffer(word).reverse().toString();
		return r;
	}
	public static void main(String[] args) {
		try {
			Naming.rebind("rmi://localhost:4000/reverse", new reverseImpl());
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