package lab5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Quanly extends UnicastRemoteObject implements Quanlychuyenbay {
	private static final long serialVersionUID = 1L;

	public Quanly() throws RemoteException {
		super();
		
	}

	ArrayList<Chuyenbay> dl = new ArrayList<Chuyenbay>();
	
	@Override
	public ArrayList<Chuyenbay> taocb() throws RemoteException {
		dl.add(new Chuyenbay("VJ011", "2/11/2020", "HCM", "NT", "10h", 100, 0, 0));
		dl.add(new Chuyenbay("VN111", "1/11/2020", "HCM", "DL", "5h", 100, 0, 0));
		dl.add(new Chuyenbay("VJ012", "3/11/2020", "HCM", "TQ", "6h", 100, 0, 0));
		dl.add(new Chuyenbay("VN112", "5/11/2020", "HCM", "HN", "11h", 100, 0, 0));
		dl.add(new Chuyenbay("VN113", "6/11/2020", "HCM", "DN", "13h", 100, 0, 0));
		dl.add(new Chuyenbay("VN013", "4/11/2020", "HCM", "TL", "15h", 100, 0, 0));
		return dl;
	}

	@Override
	public String xem() throws RemoteException {
		String tmp="";
		for (Chuyenbay cb : dl) {
			tmp +=cb.toString()+"\n";
		}
		return tmp;

	}

	@Override
	public boolean muave(String sh, int sl) throws RemoteException {
		for (Chuyenbay cb : dl) {
			if (cb.getSh().equalsIgnoreCase(sh)) {
				int b = cb.getGban();
				cb.setGban(b + sl);
				cb.setGtrong(cb.getG()-cb.getGban());
				return true;
			}
		}
		return false;
	}
	public boolean trave(String sh, int sl) throws RemoteException {
		for (Chuyenbay cb : dl) {
			if (cb.getSh().equalsIgnoreCase(sh)) {
				int b = cb.getGban();
				if(b>=sl) {
				cb.setGban(b - sl);
				cb.setGtrong(cb.getG()-cb.getGban());
				return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean themcb(Chuyenbay cbt) throws RemoteException {
		for (Chuyenbay cb : dl) {
			if (cb.getSh().equalsIgnoreCase(cbt.getSh()))
				return false;
		}
		dl.add(cbt);
		return true;
	}

	@Override
	public boolean xoacb(String sh) throws RemoteException {
		Chuyenbay cb = null;
        int size = dl.size();
        for (int i = 0; i < size; i++) {
            if (dl.get(i).getSh().equalsIgnoreCase(sh)) {
                cb = dl.get(i);
                break;
            }
        }
            return dl.remove(cb);
	}

	

}