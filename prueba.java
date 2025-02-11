public class prueba {
public static void main(String[] args) {
    String texto = "Hola mundo";
String invertido = ""; // Comienza vacía

for (int i = texto.length() - 1; i >= 0; i--) {
    invertido += texto.charAt(i);
    System.out.println(invertido); // Ver cómo se construye
}

}
}