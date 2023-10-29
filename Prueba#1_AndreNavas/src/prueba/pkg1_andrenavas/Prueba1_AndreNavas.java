/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.pkg1_andrenavas;
import  java.util.Scanner;
/**
 *
 * @author eliza
 */
public class Prueba1_AndreNavas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        //realizo un scanner llamado entrada para poder leer
        int cont_final = 0;
        //Inicio un contador final  para sumar las veces que se repita el menu principal
        int cont;
        int option=7; 
        //el option es para que se cumpla el while y se va cumplir solo si es 7
        System.out.print("Bienvenido a mi programa");
        entrada.nextLine();
        while (option==7) { 
            cont_final++;
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("1. Repetir mi nombre");
            System.out.println("2. Sub menú de mensajes");
            System.out.println("3. Salir");
            option = entrada.nextInt();
        //leo las opciones como entero, creo mi primer ciclo 
        switch (option) {
            case 1: 
                System.out.println("Usted ha elegido la opción número 1. Repetir mi nombre");
                int repita;
                // Esta opcion sirve para repetir nombre
                do {
                    System.out.println("Bienvenido al primer programa, por favor seleccione la cantidad de veces que quiere repetir su nombre: ");
                    repita = entrada.nextInt();
                    entrada.nextLine(); // Consumir el salto de línea después de leer el entero, porque luego usamos un string

                    System.out.println("Ahora dime tu nombre o el nombre del estudiante: ");
                    String nombre = entrada.nextLine();
                    //lo leemos como strign porque son oraciones
                    cont = 0;
                    //ponemos el cont a 0 para que se repita las veces que el usuario quiera repetir el nombre con ciclo while
                    while (cont < repita) {
                        System.out.println("¡Hola mi nombre es " + nombre + " y miren mi prueba!");
                        cont++;
                    }
                } while (cont < repita); //pero si no no hacemos nada
                option=7; //le asignamos como 7 para que se repita el menu
                break;
            case 2:
                int opcion = 5;
                option=7;
                while (opcion != 3) {
                    System.out.println("----- MENÚ PRINCIPAL -----");
                    System.out.println("1. Bienvenida");
                    System.out.println("2. Despedida");
                    System.out.println("3. Salir del programa");
                    System.out.print("Seleccione una opción: ");
                    opcion = entrada.nextInt();
                    //declaramos el submenu como entero y se va repetir siempre y cuando la respuesta no sea 3
                    if (opcion == 1) {
                        System.out.println("¡Bienvenido! Espero que disfrutes usando mi programa.");
                        opcion = opcion + 4; //esto es para que se repita el programa
                    } else if (opcion == 2) {
                        System.out.println("Hasta luego, gracias por usar mi programa.");
                        opcion = opcion + 4;
                    } else if (opcion == 3) {
                        System.out.println("Saliendo del programa..."); //no le asignamos nada para que no se repita
                        break;
                    } else {
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida."); //si inventa una opcion el usuario
                    }
                }

                if (opcion != 3) {
                    System.out.println("Volviendo al menú principal."); //si no es 3 la opcion le aparece este comentario al usuario
                }
                break;
            case 3:
            option=option+15; //para que no se repita el while le asignamos +15
            System.out.println("Adiós, esta fue mi prueba.");
            System.out.println("El menú principal se repitió " + cont_final + " veces."); //concatenamos para que salga la respuesta de las veces que se repitio el contador final en medio
            break;
            default:
                System.out.println("No invente compa,solo puede elegir 3 opciones (1,2,3) "); //por si el usuario inventa algo
              }        
        }
        //* Esto es como un ciclo donde uno tiene diferentes caminos a tomar,
        //que son los case, la funcion del swicth es poner la condición como si
        //fuera un if, el break sirve para terminar el ciclo (en otras palabras 
        //terminar con el caso y no seguir adelante.La condición se pone adentro
        // de los parentesis. //*
    }
    
}
