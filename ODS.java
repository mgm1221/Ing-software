import java.util.ArrayList;

public class ODS {
    private String nombre;
    private int numODS;
    ArrayList<Meta> metas;

    public ODS(String s, int n){
        this.nombre = s;
        this.numODS = n;
        this.metas = new ArrayList<>();
    }
    public String get_nombre(){
        return this.nombre;
    }
    public int get_id(){
        return this.numODS;
    }
    public ArrayList<Meta> getMetas(){
        return metas;
    }
    public ArrayList<Meta> getMetasEsp(int[] arr){
        ArrayList<Meta> m = new ArrayList<Meta>();
        int contarr = 0;
        for(Meta met: metas){
            if(met.getIdMeta() == arr[contarr]){
                m.add(met);
            }
        }
        return m;
    }

}
