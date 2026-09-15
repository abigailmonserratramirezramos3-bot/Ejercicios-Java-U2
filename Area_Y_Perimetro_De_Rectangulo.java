import java.util.Scanner;
public class Area_Y_Perimetro_De_Rectangulo {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuál es la base de su rectangulo?: ");
        double Base = teclado.nextDouble();

        System.out.print("¿Cuál es la altura de su rectangulo?: ");
        double Altura = teclado.nextDouble();

        double Area = Base * Altura;
        double Perimetro = 2 * (Base + Altura);

        System.out.println("El área del rectángulo es: " + Area);
        System.out.println("El perímetro del rectángulo es: " + Perimetro);

        teclado.close();

    }
}

