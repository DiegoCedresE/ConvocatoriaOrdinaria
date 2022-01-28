package ejercicio5;
import java.util.*;

public class Evento implements EventoHistorico{
    
    private ArrayList <Categoria> items = new ArrayList<>();
    private String nombre;
    private String fecha;
    private String localizacion;
    private String descripcion;

    public Evento(String nombre, String fecha, String localizacion, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
    }

    
    @Override
    public void notifyObservers(){
        System.out.println("Nuevo evento historico: ");
        System.out.println("--------------------");
        for (Categoria item : items) {
            item.update(nombre, localizacion, fecha, descripcion);
        }
        
    }
    
    @Override
    public void registrarCategoria(Categoria tipocategoria) {
        items.add(tipocategoria);
        System.out.println("Se ha añadido a la categoria: "  + tipocategoria);
    }
    
    
    @Override
    public void eliminarCategoria(Categoria tipoCategoria){
        items.remove(tipoCategoria);
        System.out.println("Se ha eliminado de la categoria: " + tipoCategoria);
    }
    
    
    
}
