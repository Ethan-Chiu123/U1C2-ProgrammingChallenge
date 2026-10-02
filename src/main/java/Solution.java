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
   
    public double adjustDigits(double userDouble) {
        int digit5 = (int) ((userDouble%0.1));
        int digit4 = (int) ((userDouble%0.1)*100);
        int digit3 = (int) (userDouble%10);
        int digit2 = (int) (((userDouble/10))%10);
        int digit1 = (int) (userDouble/100);
        int digit5New = digit5;
        int digit4New = digit4;
        int digit3New = digit3;
        int digit2New = digit2;
        int digit1New = digit1;
        if (digit5==9) {
            digit5New = 0;
        } else {
            digit5New ++;
        }
        if (digit4==9) {
            digit4New = 0;
        } else {
            digit4New ++;
        }
        if (digit3==9) {
            digit3New = 0;
        } else {
            digit3New ++;
        }
        if (digit2==9) {
            digit2New = 0;
        } else {
            digit2New ++;
        }
        if (digit1 == 0) {
            digit1New = 0;
        } else {
            if (digit1==9) {
                digit1New = 0;
            } else {
                digit1New ++;
            }
        }
        return ((digit1New*100)+(digit2New*10)+(digit3New)+(digit4New*0.1)+(digit5New*0.01));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
