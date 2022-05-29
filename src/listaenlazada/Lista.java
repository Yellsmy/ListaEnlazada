
package listaenlazada;

public class Lista {
    protected Nodo inicio, fin;
    public Lista(){
        this.inicio = null;
        this.fin = null;       
    }
    
    public void agregarDato(String nombre){
        inicio = new Nodo(nombre, this.inicio);  
        if(fin==null){
            fin = inicio; 
        }       
    }
    
    public void mostrarNombres(){
        Nodo aux = inicio;
        while(aux!= null){
            System.out.println("[" + aux.dato + "]");
            aux = aux.siguiente;
        }
    }
    
    public void buscarNombre(String nombre){
        Nodo aux = inicio;
        while(aux!= null){
            String dato = aux.dato;
            if(dato.equals(nombre)){
                System.out.println("Nombre buscado: " + aux.dato);
            }
            aux = aux.siguiente;
        } 
    }
}