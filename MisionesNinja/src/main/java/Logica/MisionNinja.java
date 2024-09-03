package Logica;

import java.sql.Date;

public class MisionNinja {
    private Mision mision;
    private Ninja ninja;
    private Date fecha_inicio;
    private Date fecha_fin;

    public MisionNinja() {
    }

    public MisionNinja(Mision mision, Ninja ninja, Date fecha_inicio, Date fecha_fin) {
        this.mision = mision;
        this.ninja = ninja;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public Ninja getNinja() {
        return ninja;
    }

    public void setNinja(Ninja ninja) {
        this.ninja = ninja;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    
}
