public class Indicador {
    private int numero;
    private String descripcion;
    public Indicador(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }
    public int getid() {
        return numero;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setNumero(int numero) { this.numero = numero; }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}