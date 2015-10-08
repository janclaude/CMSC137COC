import java.io.IOException;
import java.net.ServerSocket;

public class Server implements Constants{

	public static void main(String[] args) throws IOException {
		System.out.print("Server is running...");
		ServerSocket serverSocket = new ServerSocket(PORT);
		try{
			while(true){
				new Handler(serverSocket.accept()).start();
			}
		} finally {
			serverSocket.close();
		}

	}

}
