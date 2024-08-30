package solid;

import solid.lsp.Rectangle;
import solid.lsp.RectangleShape;

public class ViewShape {
    private final RectangleShape rectangle;

    public ViewShape(RectangleShape rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());
    }
}
