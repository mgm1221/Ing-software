import java.util.ArrayList;
import java.util.Date;
public class Contribucion {
    private String descripcion;
    private Date fecha;
    private Item item;
    private ODS ods;
    private ArrayList<Meta> metas;

    public Contribucion(Item item, ODS ods, ArrayList<Meta> metas, String descripcion, Date date){
        this.item = item;
        this.ods = ods;
        this.metas = metas;
        this.descripcion = descripcion;
        fecha = date;
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

