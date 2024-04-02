package I_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class I10_MariaDB {

    public static void main(String[] args) {
                // 데이터베이스 연결 객체(Connection 객체)
        Connection conn = null; //비어있는 객체선언.
        Statement stmt = null;
        ResultSet rs = null;

        try { 

            Class.forName(null); //드라이버가 
            
            //Connection 객체 생성
            String dbFile = "SQLiteDB.db"; //실제 DB에 있는 경로
            String url = "jdbc:sqlite:"+dbFile;
            conn = DriverManager.getConnection(url);

            System.out.println("정상 작동합니다..");

            stmt = conn.createStatement();
            String sql = "Create table if not exists testDB ("+
                            "id interger primary key, "+
                            "lastname text(20) not null, "+
                            "firstname text(20), age Numeric, city text(20) default 'Seoul')";
            int result = stmt.executeUpdate(sql);
            System.out.println("sql 처리결과 : "+(result));


            //crud 테스트 하세요 update insert delete select


            //Create 
            String sql1 = "insert into testDB (id, firstname, lastname, age, city)"
            + "values(1, 'jdbcTest','testuser13',24,'Seoul')";

            result = stmt.executeUpdate(sql1);

            //Read 
            String sql2 = "select * from testDB";
            rs = stmt.executeQuery(sql2);
            while(rs.next()) {    
                int id1 = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                int age = rs.getInt("age");
                String city = rs.getString("city");
                
                System.out.printf("ID: %d, First Name: %s, Last Name: %s, Age: %d, City: %s", id1, firstname, lastname, age, city);
            }

            //Update
            String sql3 = "update testDB set firstname = '순신', lastname = '이'"+"where id = 1";
            result = stmt.executeUpdate(sql3);

            //Delete
            String sql4 = "Delete from testDB where id = 1";
            result = stmt.executeUpdate(sql3);
        
        

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
               if(stmt != null) stmt.close();   
               if (rs!=null) rs.close();            
            } catch (Exception e) {    }
        }

    }
}
