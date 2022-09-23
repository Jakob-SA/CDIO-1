package spil;

public class Die {

    private int faceValue;   //hvad øjnene viser


    public Die () {

    }

    public int roll () {
        faceValue = (int)(Math.random()*6)+1;
        return faceValue;
    }

    public int getFaceValue () {
        return faceValue;
    }

}
