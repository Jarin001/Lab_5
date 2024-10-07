package shapes;

import shapes.Shapes;

public class Circle implements Shapes {
    private double x,y;
    private double radius;
    public Circle(double x, double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    @Override
    public double getX(){
        return x;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getY(){
        return y;
    }

}
