import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe la primera calificación parcial: ");
        double Parcial1 = teclado.nextDouble();

        System.out.print("Escribe la segunda calificación parcial: ");
        double Parcial2 = teclado.nextDouble();

        System.out.print("Escribe la tercera calificación parcial: ");
        double Parcial3 = teclado.nextDouble();

        System.out.print("Escribe la calificación del examen final: ");
        double ExamenFinal = teclado.nextDouble();

        System.out.print("Escribe la calificación del trabajo final: ");
        double TrabajoFinal = teclado.nextDouble();

        double promedioParciales = (Parcial1 + Parcial2 + Parcial3) / 3;

        double AporteParciales = promedioParciales * 0.55;
        double AporteExamen = ExamenFinal * 0.30;
        double AporteTrabajo = TrabajoFinal * 0.15;

        double calificacionFinal = AporteParciales + AporteExamen + AporteTrabajo;

        System.out.println("El promedio de las parciales es: " + promedioParciales);
        System.out.println("La calificación final es: " + calificacionFinal);

        teclado.close();
    }
}

