public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }


    boolean isTriangle(Triangle triangle) {

        boolean warunek = false;

        if ((triangle.a > triangle.b) && (triangle.a > triangle.c)) {
            if (triangle.b + triangle.c > triangle.a)
                warunek = true;
        }


        if ((triangle.b > triangle.a) && (triangle.b > triangle.c)) {
            if (triangle.a + triangle.c > triangle.b)
                warunek = true;
        }

        if ((triangle.c > triangle.a) && (triangle.c > triangle.a)) {
            if (triangle.a + triangle.b > triangle.c)
                warunek = true;
        }
        
        return warunek;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }


}
