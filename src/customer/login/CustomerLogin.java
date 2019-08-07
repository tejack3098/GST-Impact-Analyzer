/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer.login;
import java.sql.*;
    
      
public class CustomerLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try
        {
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/tejas316","postgres","3098");
         customerloginform mf;
            mf = new customerloginform();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
          
                
        }
        catch(ClassNotFoundException | SQLException e){
        }
        
        // TODO code application logic here
    }
    
}
       