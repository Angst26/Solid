package solid;

import solid.lsp.Rectangle;
import solid.lsp.RectangleShape;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        RectangleShape rectangle = new Square(5);
        rectangle.setSideA(4);
        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ViewShape view = new ViewShape(rectangle);
        view.showArea();
    }
}
