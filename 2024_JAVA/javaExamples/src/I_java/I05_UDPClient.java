package I_java;

import java.io.BufferedReader;
import java.net.InetAddress;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class I05_UDPClient {

    public static void main(String[] args) {
        //UDP 클라이언트는 메시지 전송

        try {
            //keybord input -> read by BufferedReader

            BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
            
            //server ip
            InetAddress serverip = InetAddress.getByName("230.0.0.1");
            while (true) {
                //one line read

                String data = sysin.readLine();
                DatagramSocket dataSocket = new DatagramSocket();
                //문자열을 바이트 배열에 저장
                byte[] msg1 = data.getBytes();

                //server transport (data, data length, server ip, port number)
                DatagramPacket outpacket = new DatagramPacket(msg1, msg1.length, serverip, 9000);
                dataSocket.send(outpacket);

                //socket close
                dataSocket.close();

            }



        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
}
1321321321313213