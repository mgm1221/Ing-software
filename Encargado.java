public class Encargado{
    private String username;
    private String correo;
    private String password;
    private String cargo;
    private String departamento;

    public Encargado(String u, String c, String p, String car, String dep){
        this.username = u;
        this.correo = c;
        this.password = p;
        this.cargo = car;
        this.departamento = dep;
    }
    public void anadir_Contribucion(int id_item,int id_cont, int id_metas[]){
        Contribucion nueva = Contribucion(id_item,id_cont,id_metas);

    }
}
