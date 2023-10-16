package bank.management.system;
import java.sql.*;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  // but eske need ne h automatic ho jata h 
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagemntsystem","root","Jj@###2##");    
            s =c.createStatement(); 
            
         
        }catch(Exception e){ 
            System.out.println(e);
            
        }  
    }  
}  
        
   
    
//    c = DriverManager.getConnection("jdbc:mysql:///bankmanagemntsystem","root","Jj@###2##");
    
    //  no main method bcos thiis file as a object
    
    // 5 steps in jdbc for established a connectrion my db and java project
    // 1.) Register the driver
//    2.) Create connection
//    3.) create statement
//    4.) execute Query
//    5.) close connection
    
