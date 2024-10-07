package shapes;

import java.util.Comparator;
import java.util.List;

public class ShapeOrderedPrinter {
    public void printOrderedShapes(List<Shapes> shapes){
        shapes.sort(Comparator.comparing(Shapes::calculateArea)
                .thenComparing(Shapes::getX)
                .thenComparing(Shapes::getY));
        for(Shapes shape:shapes){
            System.out.println("Shapes: "+shape.getClass().getSimpleName()+
                    ", Area: "+ shape.calculateArea()+
                    ", X: "+ shape.getX()+
                    ", Y: "+ shape.getY());
        }
    }
}
