import java.util.ArrayList;

public class Contribucion {
    private String descripcion;
    private Date fecha;
    private ODS ods;
    private ArrayList<Meta> metas;

    public Contribucion(ODS ods, ArrayList<Meta> metas, String s, Date d){
        this.ods = ods;
        this.metas = metas;
        this.descripcion = s;
        fecha = d;
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
    public ODS getOds(){
        return this.ods;
    }
    public ArrayList<Meta> getMetas(){

        return this.metas;
    }

}

