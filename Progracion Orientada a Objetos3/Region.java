import java.util.ArrayList;
import java.util.List;
public class Region
{
    private String nombre;
    private List<Elemento> elementos = new ArrayList<>();

    public Region(String nombre){
        this.nombre = nombre;
    }

    // Método para añadir un elemento a la región
    public void addElemento(Elemento elemento){
        elementos.add(elemento);
    }

    // Método para obtener el nombre de la región
    public String getNombre(){
        return nombre;
    }

    // Método par obtener los elementos de la región
    public List<Elemento> getElementos(){
        return elementos;
    }
}
