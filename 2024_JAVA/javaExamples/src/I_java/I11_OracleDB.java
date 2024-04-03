package I_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class I11_OracleDB {

    public static void main(String[] args) {
     
        //오라클 - PreparedStatement

        //연결 정보 필요
        String driver ="oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:11521/XEPDB1";
        String user = "spring";
        String password = "spring";
        Connection conn = null; //비어있는 객체선언.
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try { 

            Class.forName(driver); 
            
            //Connection 객체 생성
            conn = DriverManager.getConnection(url,user, password);

            System.out.println("정상 작동합니다..");

            String sql = "insert into persons (id, lastname, firstname, age) values(?,?,?,?)";
            
            //4. preparedStatement
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1,50);
            pstmt.setString(2,"testuser1111");
            pstmt.setString(3,"firstname111");
            pstmt.setInt(4, 25);

            int result = pstmt.executeUpdate();
            if(result!=0){
                System.out.println("레코드 추가 성공");
            }
            else{System.out.println("실패");}

        }catch(ClassNotFoundException e){
            System.out.println("드라이버 로드 실패");
            System.out.println(e.getMessage());

        } catch (SQLException e) {
            System.out.println("SQL 연동 실패");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(conn != null) conn.close();   
               if(pstmt != null) pstmt.close();   
               if (rs!=null) rs.close();            
            } catch (Exception e) {    }
        }



    }

}
