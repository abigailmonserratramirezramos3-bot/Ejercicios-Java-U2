import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe el total de la compra: ");
        double TotalCompra = teclado.nextDouble();

        double Descuento = TotalCompra * 0.15;
        double PagoFinal = TotalCompra - Descuento;

        System.out.print("El descuento es: $" + Descuento);
        System.out.print("El cliente tiene que pagar: $" + PagoFinal);

        teclado.close();
    }
}
