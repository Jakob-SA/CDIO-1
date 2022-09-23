package spil;

import java.util.Scanner;

public class Terningekast {
    public int Terninger() {
        Scanner input = new Scanner(System.in);
        String tast = "q";
        while (tast != "") {
            System.out.println("Tryk enter for at slå!");
            tast = input.nextLine();
        }

        int tal1 =(int) (Math.random()*6+1);
        int tal2 =(int) (Math.random()*6+1);

        return(tal1);
        /*int tal2 =(int) (Math.random()*6+1);
        int sum = tal1 + tal2;

        System.out.println(tal1);
        System.out.println(tal2);
        System.out.println("Summen er: " + sum);*/
    }
}
