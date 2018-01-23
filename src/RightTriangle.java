public class RightTriangle {

    public boolean isRightTriangle(Triangle triangle) {

        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        boolean prosty=false;

        System.out.print("Trójkąt o bokach: " + a + ", " + b + ", " + c);

        double aSquare = triangle.getA() * triangle.getA();
        double bSquare = triangle.getB() * triangle.getB();
        double cSquare = triangle.getC() * triangle.getC();


        if ((aSquare > bSquare) && (aSquare > cSquare) && (aSquare == bSquare + cSquare)) {
            prosty = true;
        }

        if ((bSquare > aSquare) && (bSquare > cSquare) && (bSquare == aSquare + cSquare)) {
                prosty = true;
        }

        if ((cSquare > aSquare) && (cSquare > bSquare) && (cSquare == aSquare + bSquare)) {
                prosty = true;
        }

        return prosty;
    }


}
