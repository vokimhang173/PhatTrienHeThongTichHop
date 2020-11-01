package lab5;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Quanlychuyenbay extends Remote{
	public String xem() throws RemoteException;
	public boolean muave(String sh, int sl) throws RemoteException;
	public boolean trave(String sh, int sl) throws RemoteException;
	public ArrayList<Chuyenbay> taocb() throws RemoteException;
	public boolean themcb(Chuyenbay cb) throws RemoteException;
	public boolean xoacb(String sh) throws RemoteException;
}
