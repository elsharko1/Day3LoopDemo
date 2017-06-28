import java.util.Scanner;

/**
 * Created by Mark on 6/28/2017.
 */
public class WhileLoopEx {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);

        String choice = "y";

        while (choice.equalsIgnoreCase("y")){
            //get some input from the user and do stuff
            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();
        }
        System.out.println("Goodbye");
    }
}
