public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return ((t1+t2+t3+t4)/4);
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) Math.round(average);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return (roundedAverage>=65);
        }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares*price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public static double adjustDigits(double userDouble) {
        int digit1 = (int) (userDouble/100)+1;
        int digit2 = (int) (userDouble%100/10);
        int digit3 = (int) (userDouble%100%10);
        int digit4 = (int) (userDouble%100%10*10%10);
        int digit5 = (int) Math.round((userDouble%100%10*100%100%10));
        digit1 = (digit1)%10;
        digit2 = (digit2+1)%10;
        digit3 = (digit3+1)%10;
        digit4 = (digit4+1)%10;
        digit5 = (digit5+1)%10;
        double value = (digit1*100)+(digit2*10)+(digit3)+(digit4/10.0)+(digit5/100.0);
        return value;
        }
    public static void main(String[] args) {
        System.out.println(adjustDigits(459.89));
    }


}
