package lab5;
import java.io.Serializable;

public class Chuyenbay implements Serializable {
	private static final long serialVersionUID = 1L;
	String sh;
	String nbay;
	String ndi;
	String nden;
	String tg;
	int g;
	int gban;
	int gtrong;

	public String getSh() {
		return sh;
	}

	public void setSh(String sh) {
		this.sh = sh;
	}

	public String getNbay() {
		return nbay;
	}

	public void setNbay(String nbay) {
		this.nbay = nbay;
	}

	public String getNdi() {
		return ndi;
	}

	public void setNdi(String ndi) {
		this.ndi = ndi;
	}

	public String getNden() {
		return nden;
	}

	public void setNden(String nden) {
		this.nden = nden;
	}

	public String getTg() {
		return tg;
	}

	public void setTg(String tg) {
		this.tg = tg;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getGban() {
		return gban;
	}

	public void setGban(int gban) {
		this.gban = gban;
	}

	public int getGtrong() {
		return gtrong;
	}

	public void setGtrong(int gt) {
		this.gtrong = gtrong;
	}

	public Chuyenbay(String sh, String nbay, String ndi, String nden, String tg, int g, int gban, int gtrong) {
		super();
		this.sh = sh;
		this.nbay = nbay;
		this.ndi = ndi;
		this.nden = nden;
		this.tg = tg;
		this.g = g;
		this.gban = gban;
		this.gtrong = gtrong;
	}

	public Chuyenbay() {
		super();
	}

	@Override
	public String toString() {
		return "Chuyenbay [sohieu=" + sh + ", ngaybay=" + nbay + ", noidi=" + ndi + ", noiden=" + nden + ", thoigian="
				+ tg + ", ghe=" + g + ", ghedaban=" + gban + ", ghetrong=" + gtrong + "]";
	}

}
