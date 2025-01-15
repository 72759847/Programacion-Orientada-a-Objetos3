
import java.util.ArrayList;
import java.util.List;
public class SistemaIdentificacion
{
   private List<Rostro> rostros = new ArrayList<>();
   
   // Método para añadir un rostro
   public void addRostro(Rostro rostro){
    rostros.add(rostro);
    }
    
    // Método para obtener la lista de rostros
    public List<Rostro> getRostros(){
    return rostros;
    }
}
