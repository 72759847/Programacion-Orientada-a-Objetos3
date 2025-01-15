
// Clase principal para probar el código
public class Main
{
    public static void main(String[] args){
        SistemaIdentificacion sistema = new SistemaIdentificacion();

        // Crear rostro
        Rostro rostro = new Rostro();

        // Crear y añadir regiones
        Region parteAlta = new Region("Parte Alta");
        Region parteMedia = new Region("Parte Media");
        Region parteBaja = new Region("Parte baja");

        rostro.addRegion(parteAlta);
        rostro.addRegion(parteMedia);
        rostro.addRegion(parteBaja);

        // Crear y añadir elementos
        Elemento ojos = new Elemento("Ojos", "Grandes y Azules");
        Elemento nariz = new Elemento("Nariz","Pequeña y recta");
        Elemento boca = new Elemento("Boca","Grande y carnosa");

        parteAlta.addElemento(ojos);
        parteMedia.addElemento(nariz);
        parteBaja.addElemento(boca);

        // Añadir rostro al sistema
        sistema.addRostro(rostro);

        // Mostrar las regiosnes y elementos del rostro
        for(Region region : rostro.getRegiones()){
            System.out.println("Region: " + region.getNombre());
            for(Elemento elemento: region.getElementos()){
                System.out.println(" " + elemento.getTipo() + ":" + elemento.getDescripcion());
            }
        }
    }
}
