package solid.srp;

public class Drawer {
    public void drawSquare(Square sqr){
        for (int i = 0; i < sqr.getSide(); i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < sqr.getSide(); i++) {
            System.out.print("*");
            for (int j = 1; j < sqr.getSide() - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < sqr.getSide(); i++) {
            System.out.print("*");
        }
    }
    
}
