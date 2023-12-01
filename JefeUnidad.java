public class JefeUnidad {
    private String username;
    private String password;
    private UnidadAcademica unidadAcademica;
    public JefeUnidad(String username, String password, UnidadAcademica unidadAcademica){
        this.username = username;
        this.password = password;
        this.unidadAcademica = unidadAcademica;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
