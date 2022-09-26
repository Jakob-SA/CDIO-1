package spil;
public class CoinFlip {

    private int value;

    public void fiftyFifty() {
        value = (int) Math.round(Math.random());
        if (value == 0)
            System.out.println("Spiller 1 starter");
        else System.out.println("Spiller 2 starter");

    }
}
