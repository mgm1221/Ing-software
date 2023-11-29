public class JefeUnidad {
    private String username;
    private String password;
    public JefeUnidad(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String get_username(){
        return this.username;
    }
}
