package obj.Exception;

import java.sql.SQLException; 
import java.io.IOException;
public class Child extends Parent{
    public void doIt() throws IOException{
        //SQLException
        System.out.println("Child.doIT");
        try{
            super.doIt();

        }catch(Exception e){
            // throw new SQLException(e.getMessage());
        }
    }

}
