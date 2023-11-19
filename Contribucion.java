public class Contribucion {
    private String descripcion;
    private Date fecha;

    public Contribucion(String s, Date d){
        this.descripcion = s;
        this.fecha = d;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
}

