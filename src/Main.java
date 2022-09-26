import spil.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        SpilStart coinFlip = new SpilStart();
        coinFlip.names();
        coinFlip.fiftyFifty();

        Scanner input = new Scanner(System.in);

        Players Player1 = new Players("a");
        Players Player2 = new Players("b");

        if (SpilStart.mont == 0) {
            Player1.Navn = coinFlip.Spiller1Navn;
            Player2.Navn = coinFlip.Spiller2Navn;
        }else {
            Player1.Navn = coinFlip.Spiller2Navn;
            Player2.Navn = coinFlip.Spiller1Navn;
        }


                  //tildeler navne til spillere




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