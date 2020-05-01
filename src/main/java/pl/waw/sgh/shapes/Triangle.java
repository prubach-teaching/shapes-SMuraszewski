package pl.waw.sgh.shapes;

public class Triangle extends Shape implements PerimeterCalculation {
    public Triangle(double a, double b, double c, double d) {
        super(a, b, c, d);
    }
    

    @Override
    public double calcSurface() {
        return (parA*parD)/2;
    }


    @Override
    public double calcPerimeter() {
        return parA + parB + parC;
    }
}
