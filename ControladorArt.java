import java.util.ArrayList;

public class ControladorArt {
    private ArrayList<Item> items;
    private ArrayList<ODS> OD;

    public void Vizualizar(){
        
        for(Item it: items){
            String nombreItem = it.getNombre();
            
            it.aportes();
        }
    }
    public void AnadirContribucion(Encargado e, int id_item, int id_ODS,int[] id_metas, String descripcion){
        Item it;
        ODS ods;
        String descripcion;
        for(Item i: items){
            if(i.getIdItem() == id_item){
                it = i;
                break;
            }
        }
        for(ODS o: OD){
            if(o.get_id() == id_ODS){
                ods = o;
                break;
            }
        }

        ArrayList<Meta> metas = ods.getMetas(id_metas);
        
        Contribucion cont = new Contribucion(ods, metas, descripcion, null)

    }

}
