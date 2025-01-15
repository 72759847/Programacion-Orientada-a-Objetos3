import java.util.ArrayList;
import java.util.List;
public class Rostro
{
 private List<Region> regiones = new ArrayList<>();
 
 // Método para añadir una región al rostro
 public void addRegion(Region region){
     regiones.add(region);
    }
    
    // Método para obtener la lista de regiones del rostro
    public List<Region> getRegiones(){
    return regiones;
    }
}
