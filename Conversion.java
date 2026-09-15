import java.util.Scanner;
public class Conversion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe la temperatura en grados Fahrenheit: ");
        double fahrenheit = teclado.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " grados Fahrenheit equivalen a "+ celsius + " grados Celsius.");

        teclado.close();
    }
}



