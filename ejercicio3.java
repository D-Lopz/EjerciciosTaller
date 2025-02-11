import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner dL = new Scanner (System.in);       

        System.out.println("Ingrese su cadena: ");
        String texto = dL.next();

        String invert = "";

        for(int i = texto.length() -1; i >= 0; i--){
            invert += texto.charAt(i);
            //System.out.println(invert);
        }

        System.out.println("El texto invertido es: " + invert);
    }
}
