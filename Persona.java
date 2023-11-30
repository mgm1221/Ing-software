public class Persona {
    private int idPersona;
    private String nombre;
    private String cargo;

    public Persona(int idPersona, String nombre, String cargo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public int getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}