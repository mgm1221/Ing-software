import java.util.ArrayList;

public class ControladorArt {
    private ArrayList<Item> items;
    private ArrayList<ODS> ods;

    public void Vizualizar(){
        
        for(Item it: items){
            String nombreItem = it.getNombre();
            it.aportes();
        }
    }

}
