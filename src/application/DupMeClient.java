package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.application.Platform;

public class DupMeClient {
	static Socket socket;
	static String name = null;
	static String opponentName = null;
	static ArrayList<Integer> myPattern = new ArrayList<Integer>();
	static ArrayList<Integer> opponentPattern = new ArrayList<Integer>();
	
	BufferedReader in;
	PrintWriter out;
//	public static String serverAddr = "10.207.92.3";
//	public static String serverAddr = "192.168.1.87";
	public static String serverAddr = "172.27.155.36";
 
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			socket = new Socket(DupMeClient.serverAddr, 9001);
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			System.out.println("No Server to connect.");
			System.exit(0);
		}
	    
		Application.launch(Main.class,args);
		
		Platform.exit();
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error closing socket, because did not connect in the first place.");
		}
	}

}
