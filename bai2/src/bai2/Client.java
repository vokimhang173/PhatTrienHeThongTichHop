package bai2;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",1022);
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());
			Scanner input = new Scanner(System.in);
			while(true) {
				System.out.println("\nI: ");
				out.writeUTF(input.nextLine());
				out.flush();
				String str =in.readUTF();
				if(str.equalsIgnoreCase("h")) {	
					break;
				}else {
					System.out.println("Server: " + str);
				}
				
			}
			System.out.println("Cuoc tro chuyen ket thuc");
			input.close();
			in.close();
			out.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("Cuoc tro chuyen ket thuc");
		}
	}

}