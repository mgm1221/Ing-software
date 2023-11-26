import java.util.ArrayList;

public class SubEJe{
    private int id_sub_eje;
    private string nombre;
    private ArrayList<Item> items;

    public SubEje(int id_sub_eje, string nombre){
        this.id_sub_eje = id_sub_eje;
        this.nombre = nombre;
    }
    public int get_Id_subEje(){
        return id_sub_eje;
    }
    public string getNombre(){
        return nombre;
    }

    public int porcentajeODS(int numODS){
        int tam = items.size();
        int contribuciones = 0;
        for(Item it: items){
            boolean flag= it.chequear_ODS(numODS);
            if(flag){
                contribuciones++;
            }
        }
    }
}