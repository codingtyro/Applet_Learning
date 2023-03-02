package 二三年03月02号.Code;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    /***
     * 
     * @param args
     * 大数的简单用法
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        input.close();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for(int i = 1;i <= k;i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        System.out.println(lotteryOdds);
    }
}
