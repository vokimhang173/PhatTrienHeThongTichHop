package bai1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1023);
			System.out.println("Server da duoc tao");
			Socket socket =server.accept();
			System.out.println("Client da ket noi den server");
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());
			while(true) {
				String str =in.readUTF();
				System.out.println("Client: " + str);
				if(str.equalsIgnoreCase("q")) {	
					break;
				}else {
					switch (str) {
					case "0":
						out.writeUTF("Không");
						break;
					case "1":
						out.writeUTF("Một");
						break;
					case "2":
						out.writeUTF("Hai");
						break;
					case "3":
						out.writeUTF("Ba");
						break;
					case "4":
						out.writeUTF("Bốn");
						break;
					case "5":
						out.writeUTF("Năm");
						break;
					case "6":
						out.writeUTF("Sáu");
						break;
					case "7":
						out.writeUTF("Bảy");
						break;
					case "8":
						out.writeUTF("Tám");
						break;
					case "9":
						out.writeUTF("Chín");
						break;
					default :
						out.writeUTF("Không phải số nguyên");
						break;
					}
				}
				out.flush();
			}
			in.close();
			out.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			System.out.println("Ket thuc");
		}

	}

}
