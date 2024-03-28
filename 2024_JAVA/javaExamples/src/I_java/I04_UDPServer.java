package I_java;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class I04_UDPServer {
    public static void main(String[] args) {
        try {
            //data gram Socket 객체 생성
            DatagramSocket socket = new DatagramSocket(9500);

            socket.setBroadcast(true);

            DatagramPacket inPacket;
            byte[] inMsg = null;

            while (true) {
                //데이터를 받기 위한 바이트 배열 생성
                inMsg = new byte[1024];
                //DatagramPacket 객체를 생성
                inPacket = new DatagramPacket(inMsg, inMsg.length); //버퍼 공간과 버퍼의 크기를 알려주니까 그만큼 크기를 주고 받는다
                //packet 데이터 수신
                socket.receive(inPacket);
                //문자열로 저장
                String msg = new String(inMsg,0,inPacket.getLength());
                System.out.println("클라이언트 메세지 : "+msg);

                //클라이언트 IP 를 저장한다.
                InetAddress address = inPacket.getAddress(); 
                //클라이언트 port
                int port = inPacket.getPort();
                System.out.println("클라이언트 주소 : "+address);
                System.out.println("클라이언트 포트 번호 : "+port);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }

}
