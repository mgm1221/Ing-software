import java.util.ArrayList;

import javafx.util.Pair;

public class Item {
    private int idItem;
    private String nombre;
    private ArrayList<Contribucion> contribuciones;

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
    public void aportes(){
        for(Contribucion cont: contribuciones){
            ODS ods = cont.getOds();
            ArrayList<Meta> m = cont.getMetas();

        }

    }
}
