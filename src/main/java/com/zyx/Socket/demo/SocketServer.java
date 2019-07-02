package com.zyx.Socket.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	
	public static void main(String[] args){
		SocketServer socketServer=new SocketServer();
		socketServer.startAction();
	}
	
	public void startAction(){
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(8888);
			System.out.println("����˷�����������:8888�˿�");
			//ͨ����ѭ�����������ӣ��������߳�ȥ������Ϣ
			while(true){
				Socket socket=serverSocket.accept();
				new Thread(new MyRuns(socket)).start();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if (serverSocket!=null){
					serverSocket.close();
				}
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	class MyRuns implements Runnable{
		Socket socket;
		BufferedReader reader0;
		BufferedReader reader;
		BufferedWriter writer;
		
		public MyRuns(Socket socket){
			super();
			this.socket=socket;
		}
		
		public void run(){
			try{
				reader0=new BufferedReader(new InputStreamReader(System.in));
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));//��ȡ�ͻ�����Ϣ
				writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//��ͻ���д��Ϣ
				String lineString="";
				
				while(!(lineString=reader.readLine()).equals("bye")){
					System.out.println("�յ����Կͻ��˷��͵���Ϣ��:"+lineString);
					writer.write("���������أ�"+reader0.readLine()+"\n");
					writer.flush();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally{
				try{
					if(reader!=null){
						reader.close();
					}
					if(writer!=null){
						writer.close();
					}
					if(socket!=null){
						socket.close();
					}
				}catch(Exception e2){
					e2.printStackTrace();
				}
			}
		}
	}
}
