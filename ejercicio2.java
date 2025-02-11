import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner dL = new Scanner (System.in);

        System.out.println("Dias: ");
        int d = dL.nextInt();

        System.out.println("Horas: ");
        int h = dL.nextInt();

        System.out.println("Minutos: ");
        int m = dL.nextInt();

        System.out.println("Segundos: ");
        int s = dL.nextInt();

        int atmg = (((((((d * 24) + h) * 60) + m) * 60) + s) * 1000);

        System.out.println("El resultado en milisegundos es: " + atmg);


    }
}
