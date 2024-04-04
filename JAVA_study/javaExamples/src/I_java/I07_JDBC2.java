package I_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class I07_JDBC2 {

    public static Scanner s = new Scanner(System.in);

    static String searchID(){

        System.out.println("찾고자 하는 ID를 입력하세요");
        int id = s.nextInt();

        return String.format("select * from Persons where id = "+id+";");
    }
    static String searchName(){
        System.out.println("찾고자 하는 이름을 입력하세요");
        String name = s.next();

        return String.format("select * from Persons where lastname like '%"+name+"%' ;");
    }
    
    public static void main(String[] args) {
        //select 처리 하기
      
        // 데이터베이스 연결 객체(Connection 객체)
        Connection conn = null; //비어있는 객체선언.
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Connection 객체 생성 - DriverManger.getConnection 이용
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
            System.out.println(conn);
            System.out.println("데이터베이스 접속 성공.");
            
            
            // Insert, Update, Delete - executeUpdate() 메서드 사용 - 반환타입이 int
            // 3.Statement 객체 생성. createStatement
            stmt = conn.createStatement();
            
            //4. SQL 작성

            //1번
            String sql1 = searchID();
            //2번
            // String sql1 = searchName();
            
            // 5. Statement 객체를 통해서 작성된 SQL을 실행
            rs = stmt.executeQuery(sql1);

            if (rs.next()) {    
                int id1 = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                int age = rs.getInt("age");
                String city = rs.getString("city");
                
                System.out.printf("ID: %d, First Name: %s, Last Name: %s, Age: %d, City: %s", id1, firstname, lastname, age, city);
            }
            else {
                System.out.println("찾고자 하는 데이터가 존재하지 않습니다.");
            }
            
                
            //입력값을 받아서 해당 결과를 출력하는 프로그램을 만드세요
            //1. ID 값을 받아서 출력함 결과가 없으면 없다고 출력하기
            //2. 이름을 통한 내용을 출력  단, 이름의 일부를 받아도 출력해야 함

      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 로드 실패");
      }catch (SQLException sqle) {
         System.out.println("SQL 연동 오류");
         System.out.println(sqle.getMessage());
      }finally {
         try {
            if(conn !=null) conn.close();
            if(stmt != null) stmt.close();
            if (rs!=null) rs.close();
         } catch (Exception e) {
         }
      }
    }

}
