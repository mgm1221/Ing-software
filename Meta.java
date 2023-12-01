import java.util.ArrayList;

public class Meta {
    private int id_meta;
    private String descripcion;
    private ArrayList<Indicador> indicadores;

    public Meta(int i, String d){
        this.id_meta = i;
        this.descripcion = d;
    }
    public int getIdMeta() {
        return this.id_meta;
    }
    public void setIdMeta(int id_meta) {
        this.id_meta = id_meta;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
