package bai2;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface searchbook extends Remote{
	public boolean search(String name) throws RemoteException, IOException;
}