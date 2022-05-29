
package listaenlazada;
import java.util.Scanner;
public class ListaEnlazada {
    Scanner opcion = new Scanner(System.in);
    Lista lista = new Lista();
    
    public void menu(){
        boolean salir = false;
        int eleccion;
        
        while(!salir){ 
           System.out.println("");
           System.out.println("1. Agregar nombre a la lista"); 
           System.out.println("2. Mostrar nombres");
           System.out.println("3. Buscar nombre");
           System.out.println("4. Salir");
           System.out.println("Selecciona una opción");
           eleccion = opcion.nextInt();
           opcion.nextLine();
           switch(eleccion){
            case 1:
                System.out.println("Ingrese un nombre: ");
                lista.agregarDato(opcion.nextLine());
                break;
            case 2:
                lista.mostrarNombres();
                break;
            case 3:
                System.out.println("Ingrese nombre a buscar: ");
                lista.buscarNombre(opcion.nextLine());
                break;
            case 4:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    
    public static void main(String[] args) {
            ListaEnlazada l = new ListaEnlazada();
            l.menu();
    } 
}