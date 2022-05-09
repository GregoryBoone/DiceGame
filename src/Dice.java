public class Dice {

    public static void diceRoll(int userValue, int computerValue){
        String one, two, three, four, five, six;

        one = "---------\n|       |\n|   *   |\n|       |\n---------";
        two = "---------\n|     * |\n|       |\n| *     |\n---------";
        three = "---------\n|     * |\n|   *   |\n| *     |\n---------";
        four = "---------\n| *   * |\n|       |\n| *   * |\n---------";
        five = "---------\n| *   * |\n|   *   |\n| *   * |\n---------";
        six = "---------\n| *   * |\n| *   * |\n| *   * |\n---------";

        switch(userValue){
            case 1: System.out.println(one); break;
            case 2: System.out.println(two); break;
            case 3: System.out.println(three); break;
            case 4: System.out.println(four); break;
            case 5: System.out.println(five); break;
            case 6: System.out.println(six); break;
            default: ;
        }

        switch(computerValue){
            case 1: System.out.println(one); break;
            case 2: System.out.println(two); break;
            case 3: System.out.println(three); break;
            case 4: System.out.println(four); break;
            case 5: System.out.println(five); break;
            case 6: System.out.println(six); break;
            default: ;
        }
    }
}
