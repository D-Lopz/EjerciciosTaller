public class ejercicio1 {

    public static void main(String[] args) {

        int numberSides = 3;
        double lengthSide = 6.0;
        double apothem = ((lengthSide) / (2*(Math.tan(Math.toRadians(180/numberSides)))));
        double perimeter = numberSides * lengthSide;
        double area = (perimeter * apothem) / 2;

        System.out.println("El áera correspondiente es: " + area);
    }
}