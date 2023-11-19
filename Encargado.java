public class Encargado{
    private string username;
    private string correo;
    private string password;
    private string cargo;
    private string departamento;

    public Encargado(string u, string c, string p, string car, string dep){
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
public class 