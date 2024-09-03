package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    private Connection connection;
    
    public Connect(){
        
        try{

            connection = DriverManager.getConnection("jdbc:mysql://172.16.101.151:3306/Ninja", "root", "1142714225");
            System.out.println("Database connected.");
            
        }catch(SQLException e){
            
            System.err.println("No se pudo conectar... "+e);
            
        }
        
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void close(){
        try{
            if(connection != null && !connection.isClosed()){ // No me gusta maven :( dice que mi conexion no es una conexion
                connection.close();
                System.out.println("Database disconnected.");
            }
        } catch(SQLException e){
            System.err.println(e);
        }
    }

}