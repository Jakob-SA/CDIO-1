import spil.Die;
import spil.Players;
import spil.Points;

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

        Points points1 = new Points(Player1);               //opretter spillere
        Points points2 = new Points(Player2);



        while (points1.points < 40) {
            String tast = "q";
            while (tast != "") {
                System.out.println("Tryk enter for at slå!");
                tast = input.nextLine();
            }
            System.out.println(die1.roll());
            System.out.println(die2.roll());


            points1.add(die1.getFaceValue(), die2.getFaceValue());

            System.out.println(Player1.Navn + " Har " + points1.points + " points.");

            tast = "q";
            while (tast != "") {
                System.out.println("Tryk enter for at slå!");
                tast = input.nextLine();
            }

            System.out.println(die1.roll());
            System.out.println(die2.roll());

            points2.add(die1.getFaceValue(), die2.getFaceValue());

            System.out.println(Player2.Navn + " Har " + points2.points + " points.");
        }
    }

}