package test;

public class Test {
    public void test() {


         int die1 = (int) (Math.random() * 6) + 1;
         int die2 = (int) (Math.random() * 6) + 1;

         int freq[] = new int[14];

        for (int counter = 0; counter < 1000; counter++) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            ++freq[die1 + die2];

        }
        System.out.println("Face \t frequency");
        for (int face = 1; face < freq.length; face++) {
            System.out.println(face + "\t" + freq[face]);
        }
    }
    }






