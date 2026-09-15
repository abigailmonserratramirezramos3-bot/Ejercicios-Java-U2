import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[ ] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = teclado.nextDouble(); //nextDouble()  es una instrucción que significa: Leer un número decimal que el usuario escriba.
        //teclado: Es el nombre de la herramienta que creamos
        //nextDouble: next = siguiente      Double = número decimal
        //Los paréntesis indican que estamos ejecutando un método, es decir, una acción.
        System.out.print("Ingrese el segundo número: ");
        double numero2 = teclado.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
         
        teclado.close();



    }

}
