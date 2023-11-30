import java.util.ArrayList;
import java.util.Date;
public class Contribucion {
    private String descripcion;
    private Date fecha;
    private Encargado encargado;
    private Item item;
    private ODS ods;
    private ArrayList<Meta> metas;

    public Contribucion(Encargado encargado, Item item, ODS ods, ArrayList<Meta> metas, String descripcion, Date date){
        this.encargado = encargado;
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
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Encargado getEncargado() {
        return encargado;
    }
    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public ODS getOds() {
        return ods;
    }
    public void setOds(ODS ods) {
        this.ods = ods;
    }
    public ArrayList<Meta> getMetas() {
        return metas;
    }
    public void setMetas(ArrayList<Meta> metas) {
        this.metas = metas;
    }
}

