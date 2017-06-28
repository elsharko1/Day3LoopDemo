/**
 * Created by Mark on 6/28/2017.
 */
public class WhileLoopInfinite {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        while (true){
            //this code will run infinite(endlessly)

            //System.out.println("looping");

            //to break out of this loop you must include a conditional statement
            //to break out of the loop you can use the key word "break"

            int randomNum = (int) (Math.random() * 10); // this line of code generating a random number from 0-10
            System.out.println(randomNum);
            //so far right now this runs infinite

            if (randomNum == 7) {
                System.out.println("vsalue is found -- exit loop");
                break;
                //so this should keep running until it finds 7
                //creates random number until it finds 7
            }
        }
        System.out.println();
        System.out.println("continue statement example");
        //for loop showing how to jump back to beginning of loop
        //lets loop from 0-5
        for (int i = 0; i < 5; i++) {
            int randomNum2 = (int) (Math.random() * 10); // this line of code generating a random number from 0-10
            //just looking for number 8-10
            if (randomNum2 > 7){
                System.out.println("invalid number -- continue loop");
                continue;
            }
            System.out.println(randomNum2);// will only execute if randomNum2 is <= 7
        }
    }
}
