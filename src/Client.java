import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client extends Thread{
	private BufferedReader in;
    private PrintWriter out;
	
	public Client(){
		Client client = new Client();
		client.start();
	}
	
	public void run(){
		 // Make connection and initialize streams
        String serverAddress = getServerAddress();
        Socket socket = null;
		try {
			socket = new Socket(serverAddress, 9001);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			in = new BufferedReader(new InputStreamReader(
			    socket.getInputStream()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // Process all messages from server, according to the protocol.
        while (true) {
            String line = null;
			try {
				line = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if (line.startsWith("SUBMITNAME")) {
                out.println(getUName());
            } else if (line.startsWith("NAMEACCEPTED")) {
                Game.gui.getChatText().setEditable(true);
            } else if (line.startsWith("MESSAGE")) {
                Game.gui.getChatBox().append(line.substring(8) + "\n");
            }
        }
	}

	private String getServerAddress() {
		 return JOptionPane.showInputDialog(
		            Game.gui,
		            "Enter IP Address of the Server:",
		            "Welcome to the Chatter",
		            JOptionPane.QUESTION_MESSAGE);
	}
	
	 private String getUName() {
	        return JOptionPane.showInputDialog(
	            Game.gui,
	            "Choose a screen name:",
	            "Screen name selection",
	            JOptionPane.PLAIN_MESSAGE);
	    }
}