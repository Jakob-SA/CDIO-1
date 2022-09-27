import spil.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        SpilStart coinFlip = new SpilStart();
        coinFlip.names();
        coinFlip.fiftyFifty();

        Scanner input = new Scanner(System.in);

        Players Player1 = new Players("Placeholder a");
        Players Player2 = new Players("Placeholder b");

        if (SpilStart.mont == 0) {                      //tildeler navne til spillere
            Player1.Navn = coinFlip.Spiller1Navn;
            Player2.Navn = coinFlip.Spiller2Navn;
        }else {
            Player1.Navn = coinFlip.Spiller2Navn;
            Player2.Navn = coinFlip.Spiller1Navn;
        }

        Die die1 = new Die();                               //opretter terninger
        Die die2 = new Die();

        Points points1 = new Points(Player1);               //opretter spillernes points
        Points points2 = new Points(Player2);

        while (points1.points < 40 && points2.points < 40) {
            String tast = "q";
            while (tast != "") {
                System.out.println("Det er " + Player1.Navn + "s tur.");
                System.out.println("Tryk enter for at slå med terningerne!");
                tast = input.nextLine();
            }

            System.out.println(die1.roll());            //spiller 1 slår med terninger
            System.out.println(die2.roll());

            points1.add(die1.getFaceValue(), die2.getFaceValue());          //lægger øjne til samlede point

            System.out.println(Player1.Navn + " Har " + points1.points + " points.");       //printer akkumulerede points

            tast = "q";
            while (tast != "") {
                System.out.println("Det er " + Player2.Navn + "s tur.");
                System.out.println("Tryk enter for at slå med terningerne!");
                tast = input.nextLine();
            }

            System.out.println(die1.roll());            //spiller 2 slår med terninger
            System.out.println(die2.roll());

            points2.add(die1.getFaceValue(), die2.getFaceValue());          //lægger øjne til samlede points

            System.out.println(Player2.Navn + " Har " + points2.points + " points.");       //printer akkumulerede points
        }


        if (points1.points > 39 && points2.points > 39) {                           //begge har over 40 points
            System.out.println("I har begge over 40 point. Jeres næste slag afgøre det");

            String tast = "q";
            while (tast != "") {
                System.out.println("Det er " + Player1.Navn + "s tur.");
                System.out.println("Tryk enter for at slå med terningerne!");
                tast = input.nextLine();
            }
            System.out.println(die1.roll());            //spiller 1 slår med terninger
            System.out.println(die2.roll());

            points1.redemption(die1.getFaceValue(), die2.getFaceValue());

            System.out.println(Player1.Navn + " Har " + points1.points + " points.");       //printer akkumulerede points

            tast = "q";
            while (tast != "") {
                System.out.println("Det er " + Player2.Navn + "s tur.");
                System.out.println("Tryk enter for at slå med terningerne!");
                tast = input.nextLine();
            }

            System.out.println(die1.roll());            //spiller 2 slår med terninger
            System.out.println(die2.roll());

            points2.redemption(die1.getFaceValue(), die2.getFaceValue());          //lægger øjne til samlede points

            System.out.println(Player2.Navn + " Har " + points2.points + " points.");       //printer akkumulerede points
        }


        if (points1.points > points2.points) {
            System.out.println("Tillykke " + Player1.Navn + "! Du har vundet!");
        } else {
            System.out.println("Tillykke " + Player2.Navn + "! Du har vundet!");
        }

    }

}