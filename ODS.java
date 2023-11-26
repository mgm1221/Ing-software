import java.util.ArrayList;

public class ODS {
    private String nombre;
    private int numODS;
    ArrayList<Meta> metas;

    public ODS(String s, int n){
        this.nombre = s;
        this.numODS = n;
    }
    public String get_nombre(){
        return this.nombre;
    }
    public int get_id(){
        return this.numODS;
    }
    public ArrayList<Meta> getMetas(int[] arr){
        ArrayList<Meta> m = new ArrayList<Meta>();
        int contarr = 0;
        for(Meta met: metas){
            if(met.get_Id_meta() == arr[contarr]){
                m.add(met);
            }
        }
        return m;
    }

}
