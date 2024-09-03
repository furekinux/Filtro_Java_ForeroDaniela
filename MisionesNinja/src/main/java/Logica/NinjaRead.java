package Logica;

import Persistencia.Connect;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NinjaRead {

    public NinjaRead() {
    }

    public void readNinja(){

        try{
            Connect connection = new Connect();
            String query = "SELECT * FROM ninja;";    
            Statement st = connection.getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("---- Ninjas ----");
            while (rs.next()) {                
                System.out.println("ID_Ninja: "+rs.getInt("id_ninja"));
                System.out.println("Nombre: "+rs.getString("nombre"));
                System.out.println("Rango: "+rs.getString("rango"));
                System.out.println("Aldea: "+rs.getString("aldea"));
            }
            rs.close();
            st.close();
            connection.close();
            
        } catch (SQLException e){
            
            System.err.println(e);
            
        }
        
    }
    
}
