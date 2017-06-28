/**
 * Created by Mark on 6/28/2017.
 */
public class DoWhileLoopEX {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        int i = 1;
        //created i for variable for counter
        int months = 36;
        double futureValue = 0;
        double monthlyPmt = 330.63;
        double interestRate = 5.99/100;
        //5.99% interest rate


         do {
             futureValue = (futureValue + monthlyPmt) * (1 + interestRate);
             i++;
        } while (i <= months);

        System.out.println(futureValue);
        //format to get rid of large decimal value
    }
}
