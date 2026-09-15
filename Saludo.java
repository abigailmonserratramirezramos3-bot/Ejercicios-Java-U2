import java.util.Scanner;  // Herramienta que permite  leer lo que escribe el ususario en la consola
public class Saludo {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in); // Aquí creamos un objeto llamado teclado.
        //Scanner: indica qué tipo de herramienta es
        //teclado: el nombre que nosotros elejimos
        //System.in: significa que leerá datos introducidos por el teclado
         

        System.out.print("¿Cuál es tu nombre?");
        String nombre = teclado.nextLine(); //String: Sirve para guardar texto
        //nombreLine(): Lee una línea completa
        
        System.out.println("Hola, " + nombre + "!");

        teclado.close();

    }

}
