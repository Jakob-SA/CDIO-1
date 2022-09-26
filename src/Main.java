import spil.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CoinFlip coinFlip = new CoinFlip();                 //bestemmer hvem der starter
        coinFlip.fiftyFifty();

        Scanner input = new Scanner(System.in);
        System.out.println("Skriv navn på spiller 1");          //tildeler navne til spillere
        Players Player1 = new Players(input.nextLine());
        System.out.println("Skriv navn på spiller 2");
        Players Player2 = new Players(input.nextLine());

        Die die1 = new Die();                               //opretter terninger
        Die die2 = new Die();

        Points points1 = new Points(Player1);               //opretter spillernes points
        Points points2 = new Points(Player2);



        while (points1.points < 40 || points2.points < 40) {
            String tast = "q";
            while (tast != "") {
                System.out.println("Tryk enter for at slå!");
                tast = input.nextLine();
            }

            System.out.println(die1.roll());            //spiller 1 slår med terninger
            System.out.println(die2.roll());

            points1.add(die1.getFaceValue(), die2.getFaceValue());          //lægger øjne til samlede point

            System.out.println(Player1.Navn + " Har " + points1.points + " points.");       //printer akkumulerede points

            tast = "q";
            while (tast != "") {
                System.out.println("Tryk enter for at slå!");
                tast = input.nextLine();
            }

            System.out.println(die1.roll());            //spiller 2 slår med terninger
            System.out.println(die2.roll());

            points2.add(die1.getFaceValue(), die2.getFaceValue());          //lægger øjne til samlede points

            System.out.println(Player2.Navn + " Har " + points2.points + " points.");       //printer akkumulerede points
        }

    }

}