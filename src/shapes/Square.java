package shapes;

import shapes.Shapes;

public class Square implements Shapes {
    private double x,y;
    private double side;
    public Square(double x, double y, double side){
        this.x=x;
        this.y=y;
        this.side=side;

    }
    @Override
    public double getX(){
        return x;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
    @Override
    public double getY(){
        return y;
    }
}
