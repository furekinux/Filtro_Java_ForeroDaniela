package Persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    
    private Connection connection;
    
    public Connection(){
        
        try{
            
            String url = "jdbc:mysql://172.16.101.151:3306/Ninja";
            String user = "root";
            String password = "1142714225";
            
            connection = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Database connected.");
            
        }catch(SQLException e){
            
            System.err.println(e);
            
        }
        
    }
    
    public Connection getConnection(){
        
        return connection;
        
    }
    
    public void close(){
        
        if(connection != null){ // No me gusta maven :( dice que mi conexion no es una conexion
            connection.close();
            System.out.println("Database disconnected.");
        }
        
    }

}