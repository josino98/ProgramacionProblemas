import java.util.LinkedList;
import java.util.Scanner;



/**
 *
 * @author Germ�n Arcos Arag�n
 */
public class Corral {
    /* Lista de animales.
     *
     */
    
    public LinkedList<Animal>animales;
    
    Scanner scanner = new Scanner(System.in);
    Scanner Nombrar = new Scanner(System.in);

//Valor arbitrario, para que el bucle for en A�adirElemento pueda iniciarse.  
    int decision = 99;
// Valor que finaliza el bucle de introducir animales al corral.
    int finalizar = 0;
//Valor que se introduce para introducir una gallina, un perro o un gato respectivamente.
    int Elegirgallina = 1;
    int Elegirperro = 2;
    int Elegirgato = 3;
    /* Constructor de la clase.
     *
     */
    public Corral() {
        animales = new LinkedList<>();
    }
    //Definir m�todo de a�adir objetos a LinkedList animales del corral.
    public void A�adirElemento(){
        /* Bucle para decidir que animal se va a introducir y cuando dejar
         * de introducir animales.
         */
        while(decision!=finalizar){
            
            System.out.println("Introduce un n�mero seg�n el tipo de animal que"
                    + " vayas a introducir al corral:"
                    + "\n 1 si es una gallina, 2 si es un perro y 3 si es un gato."
                    + "\n Para dejar de introducir animales, introduce 0.");
            
            decision = scanner.nextInt();
            /* Cada decisi�n instancia un animal de la clase correspondiente y
             * le da un nombre.
             */
            if (decision!=finalizar){
            System.out.println("Introduce el nombre del animal");
            String nombre = Nombrar.nextLine();
                if(decision==Elegirgallina){
                    Gallina gallina = new Gallina();
                    gallina.setNombre(nombre);
                    animales.add(gallina);
                }
                
                if(decision==Elegirperro){
                    Perro perro = new Perro();
                    perro.setNombre(nombre);
                    animales.add(perro);
                }
                
                if(decision==Elegirgato){
                    Gato gato = new Gato();
                    gato.setNombre(nombre);
                    animales.add(gato);
                }
            }
        }
    }
    /* Recorrer LinkedList de animales y simular un d�a llamando al m�todo
     * viveUnaHora para cada animal.
     */
    public void simulaUnD�a(){
        for (int hora=0;hora<24;hora++){
            System.out.println("---------- "+hora+"h----------");
            for (Animal animal : animales) {
                    animal.viveUnaHora(hora);
            }
        }
    }
}