package Logica;

import Persistencia.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HabilidadRead {
    
    public HabilidadRead() {
    }

    public void readHabilidad(){

        try{
            Connect connection = new Connect();
            String query = "SELECT * FROM habilidad;";    
            Statement st = connection.getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("---- Habilidades ----");
            while (rs.next()) {                
                System.out.println("ID_Ninja que la posee: "+rs.getInt("id_ninja"));
                System.out.println("Nombre: "+rs.getString("nombre"));
                System.out.println("Descripcion: "+rs.getString("descripcion"));
            }
            rs.close();
            st.close();
            connection.close();
            
        } catch (SQLException e){
            
            System.err.println(e);
            
        }
        
    }
}
