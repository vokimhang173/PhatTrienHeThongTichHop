package bai5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface reverse extends Remote {
	public String reverse(String word) throws RemoteException;
}