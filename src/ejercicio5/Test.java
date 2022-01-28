package ejercicio5;


public class Test {
    
    public static void main(String[] args) {
        EventoHistorico evento = new Evento("La conquista", "1929" , "Arrecife", "relato que cuenta como se conquisto Arrecife");
        EventoHistorico evento2 = new Evento("El debate politico", "2000" , "Gran Canaria", "Gran debate politico en el que se encuentran algunos famosos");
        EventoHistorico evento3 = new Evento("La guerra civil", "1938" , "Madrid", "Relato que cuenta todo lo que paso en la guerra civil española");
        
        Categoria b1 = new Observer("Social");
        Categoria b2 = new Observer("Politica");
        Categoria b3 = new Observer("Guerras");
        
        evento.registrarCategoria(b1);
        evento2.registrarCategoria(b2);
        evento3.registrarCategoria(b3);
        
        
        evento.notifyObservers();
        evento2.notifyObservers();
        evento3.notifyObservers();
        
        
        
        
    }
    
}
