import java.util.ArrayList;
import java.util.Date;

//import javafx.util.Pair;

public class Item {
    private int idItem;
    private String nombre;
    private ArrayList<Contribucion> contribuciones;

    public Item(int id, String nombre){
        this.idItem = id;
        this.nombre = nombre;
        this.contribuciones = new ArrayList<>();
    }
    public int getIdItem() {
        return idItem;
    }
    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void crearContribucion(Encargado e, int ods, ArrayList<Meta> metas, String descripcion, Date date){
        Contribucion cont = new Contribucion(e, idItem, ods, metas, descripcion, date);
        contribuciones.add(cont);
    }
    public boolean chequear_ODS(int numODS){
        for(Contribucion cont: contribuciones){
            ODS ods = cont.getOds();
            if (ods.get_id() == numODS) {
                return true;
            }
        }
        return false;
    }
    public boolean chequearFecha(Date fecha1, Date fecha2){
        Date fecha;
        for(Contribucion cont: contribuciones){
            fecha = cont.getFecha();
            if(fecha.equals(fecha1)){
                return true;
            }else if(fecha.equals(fecha2)){
                return true;
            }else if(fecha.after(fecha1) && fecha.before(fecha2)){
                return true;
            }
        }
        return false;
    }
}
