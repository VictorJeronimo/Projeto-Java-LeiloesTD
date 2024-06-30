
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    public String url = "jdbc:mysql://localhost:3306/leiloestd?useSSL=false";
    public String user = "root";
    public String password = "120310imfamous";
    public Connection conn;
    
    public Connection connectDB(){
       
      
        try {
            
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,password);
        System.out.println("Conexão realizada:");
     
        
        } catch (ClassNotFoundException|SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        
        }
         return conn;
    }
    
}
