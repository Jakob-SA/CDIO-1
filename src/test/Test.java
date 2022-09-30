package test;

import spil.Die;

public class Test {
    public void test()  {


            spil.Die die1 = new Die();
            spil.Die die2 = new Die();

            int freq[] = new int[15];

            for (int counter = 0; counter < 10000; counter++) {

                ++freq[die1.roll() + die2.roll()];
            }
            for (int counter2 = 0; counter2 < 10000; counter2++) {
                if (die1.roll() == die2.roll()) {
                    ++freq[14];
                }

            }
            System.out.println("Face \t frequency \t %");
            for (int face = 1; face < freq.length; face++) {
                System.out.println(face + "   \t" + freq[face] + "    \t" + (double) freq[face] / 10000 * 100);
            }
            System.out.println("Antal kast hvor terningernes øjne er ens: "+freq[14] + " og i procent "+ ((double)freq[14]/10000)*100);

        }
    }







