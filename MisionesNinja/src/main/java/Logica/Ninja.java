package Logica;

public class Ninja {
    
    private String nombre;
    private String rango;
    private String aldea;

    public Ninja() {
    }

    public Ninja(String nombre, String rango, String aldea) {
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }
    
}
