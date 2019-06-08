public class Dice {
private int numberOfDice ;

    public static void main (String [] args){
    }

    public Dice (int numberOfDice){
        this.numberOfDice = numberOfDice;
        int roll = (int) (Math.random() * 6 +1);
    }

}
