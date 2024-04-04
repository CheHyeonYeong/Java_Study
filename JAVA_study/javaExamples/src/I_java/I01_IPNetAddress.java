package I_java;

import java.net.InetAddress;

public class I01_IPNetAddress {
    public static void main(String[] args) {
        try {
            //getByName메서드를 통해 INetAddress 객체 생성

            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("hostname : "+ip.getHostName());
            System.out.println("ip : "+ip.getHostAddress());

            //2. getAllByName 메서드를 통한 InetAddress 객체 배여 생성

            InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
            for(InetAddress i: ips){
                System.out.println("ip 주소 ㅣ "+i);
            }

            // ip 주소 값을 바이트 배열로 리턴

            byte[] ipaddress = ip.getAddress();
            //byte는 자료형의 표현범위 : - 128~127사이이기 때문에 127이상은 음수로 표현됨.

            for(byte b : ipaddress){
                System.out.print(((b<0)?b+256:b )+ ".");
            }
            System.out.println();
            //3. getLocalHost 메서드를 이용한 InetAddress 객체 생성 호출
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP : " + local);
            
            //4. getByAddress 메서드 InetAddress 객체 생성 호출
            InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());

            System.out.println(ips[0].getHostAddress()+" 주소 : "+ip2);


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
