public class EncargadoEje {
    private String username;
    private String password;
    private Eje eje;
    
    public EncargadoEje(String username, String password, Eje eje){
        this.username = username;
        this.password = password;
        this.eje = eje;
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
