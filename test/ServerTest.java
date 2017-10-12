package com.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
	
	private ServerSocket server;
	
	public ServerTest(ServerSocket server) {
		
		this.server=server;
	}
	
	public void start() {
		
		try {
			Socket socket=server.accept();
			Scanner input=new Scanner(socket.getInputStream());
			
			while(input.hasNextLine()) {
				String sbf=input.nextLine();
				System.out.println(sbf);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String [] args) throws Exception{
		
		ServerTest st=new ServerTest(new ServerSocket(9999));
		
		st.start();
		
	}
	
	
	
	
	

}
