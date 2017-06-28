/**
 * Created by Mark on 6/28/2017.
 */
public class WhileLoopEx2 {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        //to start counting FIRST make and int variable
        //we're counting in this example
        int i = 1; //this is our counter variable -- it is common to use i,j, or k.

        //we want our while loop to iterate 1-4

        while (i < 5){
            //we want to simply print our loop iteration and have it count
            System.out.println("Loop " + i);
            i++;
        }
    }
}
