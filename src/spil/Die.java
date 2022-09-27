package spil;

public class Die {

    private int faceValue;   //hvad øjnene viser

    public Die () {

    }
    public int roll () {                    //terninger ruller
        faceValue = (int)(Math.random()*6)+1;
        return faceValue;
    }
    public int getFaceValue () {            //Terningeøjne
        return faceValue;
    }
}
