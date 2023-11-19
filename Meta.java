public class Meta {
    private int id_meta;
    private String descripcion;

    public Meta(int i, String d){
        this.id_meta = i;
        this.descripcion = d;
    }
    public int get_Id_meta(){
        return this.id_meta;
    }
    public  String get_descipcion(){
        return this.descripcion;
    }
}
