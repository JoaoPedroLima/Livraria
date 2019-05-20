
package ConexaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {
    public static void main( String args[] ) throws ClassNotFoundException, SQLException {
      Connection conexaoBanco = null;  
     
       Class.forName("com.mysql.jdbc.Driver");
       conexaoBanco = DriverManager.getConnection("jdbc:mysql://localhost/livraria", "root","");
      System.out.println("Acessou o banco!!!");
       }    
}


