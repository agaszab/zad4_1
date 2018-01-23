public class Program {

    public static void main(String[] args) {

        boolean wynik;

        RightTriangle rightTriangle = new RightTriangle();

        Triangle triangle = new Triangle(5, 9, 5);

        if (triangle.isTriangle(triangle)) {
            wynik = rightTriangle.isRightTriangle(triangle);
            if (wynik) {  //        nie trzeba pisać   if (wynik == true)
                System.out.println(" jest prostokątny");
            } else {
                System.out.println(" nie jest prostokątny");
            }
        }
        else System.out.println("Z podanych odcinków nie da się utworzyć trójkąta.");


    }
}