package Logica;

public class Mision {
    
    private String descripcion;
    private String rango;
    private String recompensa;

    public Mision() {
    }

    public Mision(String descripcion, String rango, String recompensa) {
        this.descripcion = descripcion;
        this.rango = rango;
        this.recompensa = recompensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }
    
}
