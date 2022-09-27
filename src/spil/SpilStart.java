package spil;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class SpilStart {
    public static int mont;
    private String tast = "q";
    public String Spiller1Navn,Spiller2Navn;
    Scanner input = new Scanner(System.in);
    public void names () {

        System.out.println("Skriv navn på spiller 1");
        Spiller1Navn = input.nextLine();
        System.out.println("Skriv navn på spiller 2");
        Spiller2Navn = input.nextLine();
    }
    public void fiftyFifty() {
        while (tast != "") {
            System.out.println("Tryk enter for tilfældigt at vælge hvem der starter");
            tast = input.nextLine();
        }
        mont = (int) Math.round(Math.random());
        if (mont == 0) {
            System.out.println("Spiller 1 starter");
        } else System.out.println("Spiller 2 starter");
    }
}
