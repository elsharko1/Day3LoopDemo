/**
 * Created by Mark on 6/28/2017.
 */
public class ForLoopEx {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        
        //write a for loop that will stores numbers 0 -4 in s string
        
        String numbers = "";
        //"" is just an empty String

        for (int i = 0; i < 5; i++) {
            numbers += i;
            //now making the i a string. casting it from an int to a String
            numbers += " ";
            //

            
        }
        System.out.println(numbers);
    }
}
