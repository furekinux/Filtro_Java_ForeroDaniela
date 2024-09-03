package Persistencia;

import java.sql.Connection;
import Logica.Habilidad;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HabilidadToDatabase {
    
    Connect connection;
    
    public void HabilidadToDatabase(Habilidad h){
        
        String query = "insert into habilidad(id_ninja,nombre,descripcion) values(?, ?, ?);";
        
        try(PreparedStatement st = connection.getConnection().prepareStatement(query)){
            
            st.setInt(1, h.getNinja());
            st.setString(2, h.getNombre());
            st.setString(3, h.getDescripcion());
            st.executeUpdate();
            st.close();
            connection.close();
            System.out.println("Habilidad actualizada...");
        } catch (SQLException e){
            
            System.err.println(e);
            
        }
        
    }
    
}
