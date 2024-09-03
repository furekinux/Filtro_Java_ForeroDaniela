package Logica;

public class Habilidad {
    
    private int ninja;
    private String nombre;
    private String descripcion;

    public Habilidad() {
    }

    public Habilidad(int ninja,String nombre, String descripcion) {
        this.ninja = ninja;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getNinja() {
        return ninja;
    }

    public void setNinja(int ninja) {
        this.ninja = ninja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
