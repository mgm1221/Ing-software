public class Encargado{
    private String username;
    private String correo;
    private String password;
    private String cargo;
    private String departamento;
    private ControladorArt controlador;

    public Encargado(String u, String c, String p, String car, String dep, ControladorArt controlador){
        this.username = u;
        this.correo = c;
        this.password = p;
        this.cargo = car;
        this.departamento = dep;
        this.controlador = controlador;
    }
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public String getDepartamento() {return departamento;}
    public void setDepartamento(String departamento) {this.departamento = departamento;}
}
