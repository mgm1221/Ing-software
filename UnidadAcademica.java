import java.util.ArrayList;

public class UnidadAcademica {
    private int idUnidadAc;
    private String nombre;
    private ArrayList<Persona> personas;

    public UnidadAcademica(int idUnidadAc, String nombre){
        this.idUnidadAc = idUnidadAc;
        this.nombre = nombre;
        personas = new ArrayList<>();
    }

    public int getIdUnidadAc() {
        return idUnidadAc;
    }
    public void setIdUnidadAc(int idUnidadAc) {
        this.idUnidadAc = idUnidadAc;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Persona> getPersonas() {
        return this.personas;
    }
}

