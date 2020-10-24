package bai1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",1023);
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());
			Scanner input = new Scanner(System.in);
			while(true) {
				System.out.println("\nI: ");
				out.writeUTF(input.nextLine());
				out.flush();
				String str =in.readUTF();
				System.out.println("Server: " + str);
			}
		} catch (IOException e) {
			System.out.println("ket thuc");
		}
	}

}