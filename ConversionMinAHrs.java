import java.util.Scanner;
// Importamos Scanner para poder leer datos escritos por el usuario.

public class ConversionMinAHrs {
    public static void main(String[] args) {
        // Creamos el objeto teclado para leer información de la consola.
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario la cantidad total de minutos.
        System.out.print("Escribe la cantidad de minutos: ");

        // Guardamos el número que escriba el usuario.
        int minutosTotales = teclado.nextInt();
        // Dividimos los minutos totales entre 60.
        //La división entera nos da la cantidad de horas completas.

        int horas = minutosTotales / 60;

        //El operador % obtiene el residuo de una división.
        //Aquí nos dice cuántos minutos sobran después de formar las horas.
        
        int minutosRestantes = minutosTotales % 60;

        // Mostramos el resultado final en pantalla.
        System.out.println(minutosTotales + " minutos son equivalentes a "+ horas + " horas y "+ minutosRestantes + " minutos"
        );

        teclado.close();
    }
}

