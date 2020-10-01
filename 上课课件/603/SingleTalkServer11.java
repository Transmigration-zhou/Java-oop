import java.net.*;
import java.io.*;

public class SingleTalkServer11 {
	public static void main(String[] args) throws Exception {
	
		ServerSocket serverSocket = new ServerSocket(4444);
		System.out.println("我在4444端口等着!");

		Socket clientSocket = serverSocket.accept();  
		System.out.println("Accept OK!");
		System.out.println();

		PrintWriter outToClient = new PrintWriter(
										clientSocket.getOutputStream(), true);
		BufferedReader inFromClient = new BufferedReader(
										new InputStreamReader(clientSocket.getInputStream()));
		BufferedReader sin = new BufferedReader(
										new InputStreamReader(System.in));

		String sinputLine = null;
		String inputLine = null;

		while (true) {
			System.out.print("Client");

			inputLine = inFromClient.readLine();
			System.out.println(": " + inputLine);

			System.out.print("Server: ");
			sinputLine = sin.readLine();
			outToClient.println(sinputLine);
			// outToClient.flush();
		}

		//outToClient.close();
		//inFromClient.close();
		//sin.close();

		//clientSocket.close();
		//serverSocket.close();
	}
}
