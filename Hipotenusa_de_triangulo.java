import java.util.Scanner;
public class Hipotenusa_de_triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
// Scanner: Es una clase de Java que sirve para leer datos,
// puede leer números enteros, texto, numeros decimales. Para 
//poder utilizarla, necesitamos escribir arriba del programa:
// (import java.util.Scanner;), sin ese import, java no sabría donde encontrar Scanner
        System.out.print("valor del cateto opuesto: ");
        double CatetoOpuesto = teclado.nextDouble();
        System.out.print("valor del cateto adyacente: ");   
        double CatetoAdyacente = teclado.nextDouble();
        double Hipotenusa = Math.sqrt(CatetoOpuesto*CatetoOpuesto + CatetoAdyacente*CatetoAdyacente);
        //La raíz cuadrada se escribe así: Math.sqrt();    Para elevar al cuadrado
        // normalmente se escribe a*a  ó  Math.pow(a,2), a elevado a la 2
        System.out.println("La hipotenusa del triangulo es: " + Hipotenusa);

         teclado.close();

    }
         

}
