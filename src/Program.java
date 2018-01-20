public class Program {

    public static void main(String[] args) {

        boolean wynik;

        RightTriangle rightTriangle = new RightTriangle();

        Triangle triangle = new Triangle(72, 12, 33);

        wynik = rightTriangle.isRightTriangle(triangle);

        if (wynik == true) {
            System.out.println(" jest prostokątny");
        } else {
            System.out.println(" nie jest prostokątny");
        }
    }
}