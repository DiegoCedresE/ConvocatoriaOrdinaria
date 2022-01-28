package ejercicio5;

public class Observer implements Categoria{
    
    private String TipoCategoria;

    public Observer(String TipoCategoria) {
        this.TipoCategoria = TipoCategoria;
    }

    
    @Override
    public void update(String nombre, String fecha, String localizacion, String descripcion){
        System.out.println("Soy un hecho de la categoria: " +  TipoCategoria
        + " con nombre: " + nombre + ", fecha: " + fecha
        + " y localizacion " + localizacion
        + " cuya descipcion es: " +  descripcion);
    }
    
}
