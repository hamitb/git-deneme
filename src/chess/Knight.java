package chess;

public class Knight {
    private int positionX;
    private int positionY;
    private boolean isBlack;
    private boolean isCaptured;

    public Knight(int x, int y, boolean isBlack) {
        this.positionX = x;
        this.positionY = y;
        this.isBlack = isBlack;
        this.isCaptured = false;
    }

    public void move() {
        System.out.println("The knight is moving from: (" + positionX + ", " + positionY + ")");

        this.positionX += 1;
        this.positionY += 2;

        if (this.positionX > 7 || this.positionY > 7) {
            throw new RuntimeException("Knight can't move out of the board.");
        }

        System.out.println("The knight is now at: (" + positionX + ", " + positionY + ")");
    }
}