import java.util.Scanner;

// Esta es la clase principal del programa
public class SueldoComision {
    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Escribe el sueldo base: ");
        double sueldoBase = teclado.nextDouble();

        System.out.print("Escribe el valor de la primera venta: ");
        double venta1 = teclado.nextDouble();

 
        System.out.print("Escribe el valor de la segunda venta: ");
        double venta2 = teclado.nextDouble();

        System.out.print("Escribe el valor de la tercera venta: ");
        double venta3 = teclado.nextDouble();

      
        double ventasTotales = venta1 + venta2 + venta3;
        double comision = ventasTotales * 0.10;

        double totalRecibido = sueldoBase + comision;

        System.out.print("La comisión obtenida es: $" + comision);

        
        System.out.print("El total del mes es: $" + totalRecibido);
        teclado.close();
    }
}

