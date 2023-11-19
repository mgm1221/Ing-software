public class ODS {
    private String nombre;
    private int numODS;

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

}
