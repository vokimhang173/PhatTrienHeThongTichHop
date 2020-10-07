package lab3;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.net.*;
import java.io.*;

public class SourceViewer2 {
	public static void main(String[] args) {
		if (args.length !=1) {
			try {
				URL u = new URL("https://www.youtube.com/");
				URLConnection uc = u.openConnection();
				InputStream raw = uc.getInputStream();
				InputStream buffer = new BufferedInputStream(raw);
				Reader r = new InputStreamReader(buffer);
				int c;
				while ((c = r.read()) != -1) {
					System.out.print((char) c);
				}
			} catch (MalformedURLException ex) {
				System.err.println("https://www.youtube.com/" + " is not a parseable URL");
			} catch (IOException ex) {
				System.err.println(ex);
			}
		}
	}
}
