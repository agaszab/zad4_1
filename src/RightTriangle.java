public class RightTriangle {

    public boolean isRightTriangle(Triangle triangle) {

        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        boolean prosty;

        System.out.print("Trójkąt o bokach: " + a + ", " + b + ", " + c);

        a = a * a;
        b = b * b;
        c = c * c;


        if ((a > b) && (a > c)) {
            if (a == b + c) {
                prosty = true;
            } else {
                prosty = false;
            }
        }

        if ((b > a) && (b > c)) {
            if (b == a + c) {
                prosty = true;
            } else {
                prosty = false;
            }
        }

        if ((c > a) && (c > b)) {
            if (c == a + b) {
                prosty = true;
            } else {
                prosty = false;

            }
        }

        return prosty;
    }


}
