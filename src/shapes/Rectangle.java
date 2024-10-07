package shapes;

import shapes.Shapes;

public class Rectangle implements Shapes {
    private double x,y;
    private double width,height;
    public Rectangle(double x, double y, double width, double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    @Override
    public double getX(){
        return x;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }
    @Override
    public double getY(){
        return y;
    }

}
