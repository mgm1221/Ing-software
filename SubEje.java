import java.util.ArrayList;
import java.util.Date;

public class SubEje{
    private int id_sub_eje;
    private String nombre;
    private ArrayList<Item> items;

    public SubEje(int id_sub_eje, String nombre){
        this.id_sub_eje = id_sub_eje;
        this.nombre = nombre;
        this.items = new ArrayList<>();
    }
    public int getIdSubEje() {
        return id_sub_eje;
    }
    public void setIdSubEje(int id_sub_eje) {
        this.id_sub_eje = id_sub_eje;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public float porcentajeODS(int numODS){
        int total = items.size();
        int contribuciones = 0;
        for(Item it: items){
            boolean flag = it.chequear_ODS(numODS);
            if(flag){
                contribuciones++;
            }
        }
        return (contribuciones/total)*100;
    }
    public ArrayList<Item> chequearFecha(Date fecha1, Date fecha2){
        ArrayList<Item> auxItems = new ArrayList<>();
        for(Item it: items){
            boolean flag = it.chequearFecha(fecha1, fecha2);
            if(flag){
                auxItems.add(it);
            }
        }
        return auxItems;
    }
}