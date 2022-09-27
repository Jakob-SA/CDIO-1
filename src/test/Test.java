package test;

import spil.Die;

public class Test {
    public void test() {
         spil.Die die1 = new Die();
         spil.Die die2 = new Die();

         int freq[] = new int[14];

        for (int counter = 0; counter < 1000; counter++) {

            ++freq[die1.roll() + die2.roll()];

        }
        System.out.println("Face \t frequency");
        for (int face = 1; face < freq.length; face++) {
            System.out.println(face + "\t" + freq[face]);
        }
    }
    }






