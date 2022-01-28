package ejercicio5;

public interface EventoHistorico {
    
    public void registrarCategoria(Categoria tipocategoria);
    public void notifyObservers();
    public void eliminarCategoria(Categoria tipoCategoria);
    
}
