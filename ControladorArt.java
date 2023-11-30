import java.util.ArrayList;
import java.util.Date;

public class ControladorArt {
    private ArrayList<Item> items;
    private ArrayList<ODS> OD;

    public void AnadirContribucion(Encargado e, int id_item, int id_ODS,int[] id_metas, String descripcion, Date fecha){
        Item it = null;
        ODS ods = null;
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

        ArrayList<Meta> metas = ods.getMetasEsp(id_metas);
        
        it.crearContribucion(e,id_ODS, metas, descripcion, fecha);

    }

}
