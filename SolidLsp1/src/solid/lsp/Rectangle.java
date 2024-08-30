package solid.lsp;

public class Rectangle implements RectangleShape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    private void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public int getArea() {
        return sideA * sideB;
    }
}
