import java.util.ArrayList;
import java.util.Date;

public class Eje {
    private int id_eje;
    private String nombre;
    private ArrayList<SubEje> subEjes;

    public Eje(int i, String n){
        this.id_eje = i;
        this.nombre = n;
    }
    public String get_nombre(){
        return this.nombre;
    }
    public int get_id(){
        return this.id_eje;
    }
    public ArrayList<SubEje> getSubEjes(){
        return subEjes;
    }
    public ArrayList<Item> items_intervalo(Date fecha1, Date fecha2){
        ArrayList<Item> items = new ArrayList<>();
        for(SubEje se: subEjes){
            ArrayList<Item>auxItems = se.chequearFecha(fecha1,fecha2);
            if(auxItems != null){
                items.addAll(auxItems);
            }
        }
        return items;
    }
}
