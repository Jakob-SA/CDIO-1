import spil.Die;
import spil.Players;
import spil.Points;
import spil.SpillerNavne;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv navn på spiller 1");
        Players Player1 = new Players(input.nextLine());

        System.out.println("Skriv navn på spiller 2");
        Players Player2 = new Players(input.nextLine());              //tildeler navne til spillere




        Die die1 = new Die();                               //opretter terninger
        Die die2 = new Die();



        String tast = "q";
        while (tast != "") {
            System.out.println("Tryk enter for at slå!");
            tast = input.nextLine();
        }
        System.out.println(die1.roll());
        System.out.println(die2.roll());

        Points player1 = new Points(Player1);
        Points player2 = new Points(Player2);
        player1.add(die1.getFaceValue(), die2.getFaceValue());
        System.out.println(Player1.Navn + " Har " + player1.points + " points.");

    }

}