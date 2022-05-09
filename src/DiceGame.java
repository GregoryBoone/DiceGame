public class DiceGame {
    public static void main(String[] args){
        Dice diceObject = new Dice();

        System.out.println("Run the application to roll your dice");

        int min = 1;
        int max = 6;
        int userValue = (int)Math.floor(Math.random()*(max-min+1)+min);
        int computerValue = (int)Math.floor(Math.random()*(max-min+1)+min);

        diceObject.diceRoll(userValue, computerValue);

        if(userValue > computerValue){
            System.out.println("You won!");
        }
        else if(userValue < computerValue){
            System.out.println("You lost.  Try again!");
        }
        else{
            System.out.println("It's a draw.  Whoa!");
        }
    }
}

