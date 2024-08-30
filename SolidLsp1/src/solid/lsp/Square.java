package solid.lsp;

public class Square implements RectangleShape {

    private int sideA;

    public Square(int side) {
        this.sideA = side;
    }

    @Override
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public int getSideA() {
        return this.sideA;
    }

    @Override
    public int getSideB() {
        return this.sideA;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(getSideA(), 2);
    }
}
