package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetUrlConnection {
	public static void main(String[] args) {
		URL u;
		URLConnection uc;
		
		try {
			u = new URL("http://iuh.edu.vn");
			uc = u.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
			String thisLine;
			while((thisLine = br.readLine())!= null)
				System.out.println(thisLine);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
