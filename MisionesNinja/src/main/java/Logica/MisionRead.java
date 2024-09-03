package Logica;

import Persistencia.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MisionRead {
    
    public MisionRead() {
    }

    public void readMision(){

        try{
            Connect connection = new Connect();
            String query = "SELECT * FROM mision;";    
            Statement st = connection.getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("---- Misiones ----");
            while (rs.next()) {                
                System.out.println("ID_Mision: "+rs.getInt("id_mision"));
                System.out.println("Descripcion: "+rs.getString("descripcion"));
                System.out.println("Rango: "+rs.getString("rango"));
                System.out.println("Recompensa: "+rs.getString("recompensa"));
            }
            rs.close();
            st.close();
            connection.close();
            
        } catch (SQLException e){
            
            System.err.println(e);
            
        }
        
    }
}
