package week08d01;

public class Robot {

    private int x = 0;
    private int y = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "x= " + getX() + " y= " + getY();
    }

    public RoboPos move(String move) {
        move = move.toUpperCase();
        String p;
        for (int i = 0; i < move.length(); i++) {
            p = move.substring(i, i + 1);
            switch (p) {
                case "L":
                    y--;
                    break;
                case "F":
                    y++;
                    break;
                case "B":
                    x--;
                    break;
                case "J":
                    x++;
                    break;
                default:
                    throw new IllegalArgumentException("Only characters L, F, B, J can be used");
            }
        }
        return new RoboPos(x,y);
    }
}