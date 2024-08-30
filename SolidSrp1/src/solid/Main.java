package solid;

import solid.srp.Drawer;
import solid.srp.Point;
import solid.srp.Square;

public class Main {
    public static void main(String[] args) {
        Drawer drawer = new Drawer();
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        drawer.drawSquare(square);
    }
}
