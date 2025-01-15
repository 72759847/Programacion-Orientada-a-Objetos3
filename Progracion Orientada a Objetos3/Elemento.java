
public class Elemento
{
    private String tipo;
    private String descripcion;

    public Elemento(String tipo, String descripcion){
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Métodos get para los atributos
    public String getTipo(){
        return tipo;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
