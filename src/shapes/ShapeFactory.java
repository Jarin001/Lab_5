package shapes;
public class ShapeFactory {
    public static Shapes createShapes(String type, double x, double y, double... dimensions){
        switch (type.toLowerCase()){
            case "circle":
                return new Circle(x,y,dimensions[0]);
            case "rectangle":
                return new Rectangle(x,y,dimensions[0],dimensions[1]);
            case "square":
                return new Square(x,y,dimensions[0]);
            default:
                throw new IllegalArgumentException("Unknown shape.");
        }
    }
}
