package spil;

import java.util.Scanner;

public class Terningekast {
    public void Terninger() {
        java.lang.Math.random();
        Scanner input = new Scanner(System.in);
        input.next();

        int tal1 =(int) (Math.random()*6+1);
        int tal2 =(int) (Math.random()*6+1);
        int sum = tal1 + tal2;

        System.out.println(tal1);
        System.out.println(tal2);
        System.out.println("Summen er: " + sum);
    }
}
