import java.io.*;
import java.net.*;

public class SingleTalkClient11 {
	public static void main(String[] args) throws IOException {

		Socket client = new Socket("127.0.0.1", 4444);
		PrintWriter outToServer = new PrintWriter(client.getOutputStream(),true);
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
		BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

		String fromServer, fromUser;

		System.out.print("Client: ");
		fromUser = sin.readLine();
		while (true) {
			outToServer.println(fromUser);
			//outToServer.flush();

			System.out.print("Server");
			fromServer = inFromServer.readLine();
			System.out.println(": " + fromServer);
			System.out.print("Client: ");
			fromUser = sin.readLine();
		}

		//outToServer.close();
		//inFromServer.close();
		//sin.close();
		//client.close();
	}
}
