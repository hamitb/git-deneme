package chess;

public class Game {

    public static void main(String[] args) {
        Knight firstKnight = new Knight(4, 5, true);
        Knight secondKnight = new Knight(2, 3, false);
        Knight thirdKnight = new Knight(1, 4, false);

        firstKnight.move();
        secondKnight.move();
        thirdKnight.move();

        thirdKnight.move();
    }
}
