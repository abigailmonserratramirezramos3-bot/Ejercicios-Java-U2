import java.util.Scanner;
public class MediaDe_3_Numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = teclado.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = teclado.nextDouble();

        double Media = (numero1 + numero2 + numero3) / 3;

        System.out.print("La media de los tres números es: " + Media);

        teclado.close();
    }

}
