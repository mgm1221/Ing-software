public class Eje {
    private int id_eje;
    private String nombre;

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
}
