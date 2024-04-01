package obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDAO {

    //Connection 객체를 생성하기 위한 값
    private String url ="jdbc:mysql://localhost:3306/testdb";
    private String user = "root";
    private String password = "root";

    //데이터 접속을 위한 객체 데이터베이스 연결 객체(Connection 객체)
    Connection conn = null; //비어있는 객체선언.
    Statement stmt = null;
    ResultSet rs = null;

    //생성자 : Connection 객체를 생성
    public PersonsDAO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connection 객체 생성 - DriverManger.getConnection 이용
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
            System.out.println("데이터베이스 접속 성공.");
            
           
            
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
        }
        catch(SQLException sqle) {
            System.out.println("SQL 연동 오류");
            System.out.println(sqle.getMessage());

        }
    }

    //CRUD 메서드 구현

    //1 데이터 입력 메서드 구현

    public int insert(PersonsVO vo){
        int result = 0;
        String sql = "insert into Persons (firstname, lastname, age, city)"+ "values('"+vo.getFirstName()+"','"+vo.getLastName()+"',"+ vo.getAge()+",'"+vo.getCity()+"')";
        
        return values(sql);
    }

    // 2 전체 데이터 출력 메서드 구현 
    
    public List<PersonsVO> allPersons(){
        List<PersonsVO> pList = new ArrayList<>();
        
        String sql = "select * from Persons;";

        try { 
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");
				String city = rs.getString("city");

				System.out.printf("id : %d, 성 : %s, 이름 : %s, 나이 : %d, 도시 : %s \n",
						id, firstname, lastname, age, city);
                PersonsVO vo = new PersonsVO(id, firstname, lastname, age, city);
                pList.add(vo);
			}
   
        } catch (SQLException e) {
            System.out.println("SQL 연동 실패");
            System.out.println(e.getMessage());
        }
        finally {
            try {
               if(stmt != null) stmt.close();   
               if (rs!=null) rs.close();            
            } catch (Exception e) {    }
        }

        return pList;
    }

    public PersonsVO selectOne (int id){
        PersonsVO vo = null;
        String sql = String.format("select * from Persons where id = "+id+";");

        try { 
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {    
                
                int id1 = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                int age = rs.getInt("age");
                String city = rs.getString("city");
                vo = new PersonsVO(id1, firstname, lastname, age, city);
            }
            else{ System.out.println("없는 데이터입니다");}
   
        } catch (SQLException e) {
            System.out.println("SQL 연동 실패");
            System.out.println(e.getMessage());
        }
        finally {
            try {
               if(stmt != null) stmt.close();   
               if (rs!=null) rs.close();            
            } catch (Exception e) {    }
        }
        return vo;
    }

    public PersonsVO selectOne (String name){
        PersonsVO vo = null;
        String sql ="select * from Persons where lastname like '%"+name+"%' ;";
        
        try { 
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);    
            if (rs.next()) {    
                
                int id1 = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                int age = rs.getInt("age");
                String city = rs.getString("city");
                vo = new PersonsVO(id1, firstname, lastname, age, city);
            }
            else{ System.out.println("없는 데이터입니다");}
   
        } catch (SQLException e) {
            System.out.println("SQL 연동 실패");
            System.out.println(e.getMessage());
        }
        finally {
            try {
               if(stmt != null) stmt.close();   
               if (rs!=null) rs.close();            
            } catch (Exception e) {    }
        }
        return vo;
    }

    //3 정보 수정 메서드 구현

    public int update(PersonsVO vo){
        int result = 0;

        String sql = "update Persons set firstname='"+vo.getFirstName()+"', lastname='"+vo.getLastName()+ "', age="+ vo.getAge()+", city='"+vo.getCity()+"' where id = "+vo.getId();
           
        return values(sql); 

    }
    //4 정보 삭제 메서드 구현


    public int delete (int id){
        int result = 0;
        String sql = "delete from Persons where id ="+id;
       
        return values(sql);
    }

    public int values(String sql){
        int result =0;
        try { 
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
   
        } catch (SQLException e) {
            System.out.println("SQL 연동 실패");
            System.out.println(e.getMessage());
        }
        finally {
            try {
               if(stmt != null) stmt.close();   
               if (rs!=null) rs.close();            
            } catch (Exception e) {    }
        }
        return result;
    }


}
