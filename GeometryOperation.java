package coremathlibrary;

public class GeometryOperation extends MathOperation {

    private double dimension1;
    private double dimension2;
    private double dimension3;

    public void setDimension1(double d1) {
        if (d1 < 0) {
            System.out.println("Values cannot be negative");
            this.dimension1 = 0;
        } else {
            this.dimension1 = d1;
        }
    }

    public void setDimension2(double d2) {
        if (d2 < 0) {
            System.out.println("Values cannot be negative");
            this.dimension2 = 0;
        } else {
            this.dimension2 = d2;
        }
    } 

    public void setDimension3(double d3) {
        if (d3 < 0) {
            System.out.println("Values cannot be negative");
            this.dimension3 = 0;
        } else {
            this.dimension3 = d3;
        }
    }

    public void ComputeCircleArea() {
        double area = Math.PI * (this.dimension1 * this.dimension1);
        System.out.println("The area of the circle is: " + area);
    }
    
    public void ComputeRectangleArea() {
        double area = this.dimension1 * this.dimension2;
        System.out.println("The area of the rectangle is: " + area);
    }
}