package shapestest;
import shapes.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ShapesTest {
    @Test
    public void CircleArea(){
        Circle c = new Circle(1,1,2);
        double area = c.calculateArea();
        double expected= Math.PI*2*2;
        assertEquals(expected,area);
    }
    @Test
    public void SquareArea(){
        Square s = new Square(1,1,2);
        double area = s.calculateArea();
        double expected= 2*2;
        assertEquals(expected,area);
    }
    @Test
    public void RectangleArea(){
        Rectangle c = new Rectangle(1,1,2,3);
        double area = c.calculateArea();
        double expected= 2*3;
        assertEquals(expected,area);
    }
    @Test
    public void testSquareArea(){
        Shapes square = ShapeFactory.createShapes("square",1,1,3);
        assertEquals(9.0,square.calculateArea());
    }
    @Test
    public void testCircleArea(){
        Shapes circle = ShapeFactory.createShapes("Circle",1,1,5);
        assertEquals(78.53981633974483,circle.calculateArea());
    }
    @Test
    public void testReactangleArea(){
        Shapes rectangle = ShapeFactory.createShapes("RecTangle",1,1,4,6);
        assertEquals(24.0,rectangle.calculateArea());
    }
    @Test
    public void testShapeOrderingByArea(){
        Shapes square = ShapeFactory.createShapes("square",1,1,3);
        Shapes circle = ShapeFactory.createShapes("Circle",1,1,5);
        Shapes rectangle = ShapeFactory.createShapes("RecTangle",1,1,4,6);
        ShapeOrderedPrinter printer = new ShapeOrderedPrinter();
        List<Shapes> shapes = Arrays.asList(circle,square,rectangle);
        printer.printOrderedShapes(shapes);

        assertEquals(9.0, shapes.get(0).calculateArea());
        assertEquals(24.0, shapes.get(1).calculateArea());
        assertEquals(78.53981633974483, shapes.get(2).calculateArea());

    }

@Test
    public void testShapeOrderingByXPosition(){
    Shapes square = ShapeFactory.createShapes("square",1,1,4);
    Shapes circle = ShapeFactory.createShapes("Circle",3,0,2);
    Shapes rectangle = ShapeFactory.createShapes("RecTangle",2,2,2,3);
    ShapeOrderedPrinter printer = new ShapeOrderedPrinter();
    List<Shapes> shapes = Arrays.asList(circle,square,rectangle);
    printer.printOrderedShapes(shapes);

    assertEquals(2.0, shapes.get(0).getX());
}

@Test
    public void testShapeOrderingByYPosition(){
    Shapes square1 = ShapeFactory.createShapes("square",1,2,4);
    Shapes square2 = ShapeFactory.createShapes("square",1,1,4);
    ShapeOrderedPrinter printer = new ShapeOrderedPrinter();
    List<Shapes> shapes = Arrays.asList(square2,square1);
    printer.printOrderedShapes(shapes);

    assertEquals(1.0, shapes.get(0).getY());
    assertEquals(2.0, shapes.get(1).getY());
}

@Test
    public void testShapeOrderingWithEqualAreas(){
        Shapes square = ShapeFactory.createShapes("square",2,2,3);
    Shapes circle = ShapeFactory.createShapes("Circle",1,1,Math.sqrt(9/Math.PI));
    ShapeOrderedPrinter printer = new ShapeOrderedPrinter();
    List<Shapes> shapes = Arrays.asList(square,circle);
    printer.printOrderedShapes(shapes);

    assertEquals(1.0,shapes.get(0).getX());
}

}
