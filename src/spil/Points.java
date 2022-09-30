package spil;
public class Points {
    public int points;
    public Points(Players spiller) {
        points = 0;
    }
    public int add(int die1, int die2) {
        points += die1 + die2;
        return points;
    }
    public int printPoints () {
        return points;
    }
    public int redemption (int die1, int die2) {
        points = die1 + die2;
        return points;
    }
}