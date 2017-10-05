package edu.ashish.numbers;

/**
 * Created by ashish.bhargava on 10/5/2017.
 */
public class AddFractions {

    public static void main(String... args) {
         int n1 = 3;
         int d1 = 4;
         int n2 = 4;
         int d2 = 4;

         int gcd = gcd(d1, d2);
         int lcm = lcm(d1, d2);
         System.out.println("GCD is: " + gcd);
         System.out.println("LCM is: " + lcm);
         addFraction(n1, d1, n2, d2);
    }

    private static int[] addFraction(int n1, int d1, int n2, int d2) {

        int[] fraction = new int[2];
        int sumNumerator;
        int sumDenominator;

        /*if(d1 == d2) {
            sumDenominator = d1;
            sumNumerator = n1 + n2;
            fraction[0] = sumNumerator;
            fraction[1] = sumDenominator;
            return fraction;
        }*/
        int lcm = lcm(d1, d2);
        sumNumerator = n1 * (lcm/d1) + n2 * (lcm/d2);
        sumDenominator = lcm;
        //3\5 + 4\6 =  18+20\30 = 38/30 =

        int commonFactor = gcd(sumNumerator, sumDenominator);
        System.out.println("Common Factor is: " + commonFactor);
        fraction[0] = sumNumerator/commonFactor;
        fraction[1] = sumDenominator/commonFactor;

        System.out.println(fraction[0] + " " + fraction[1]);
        return fraction;

    }

    private static int gcd(int d1, int d2) {

        if(d1 == 0) {
            return d2;
        }
        if (d2 == 0) {
            return d1;
        }

        if(d1 == d2) {
            return d1;
        }

        if(d1 > d2) {
            return gcd(d1-d2, d2);
        } else {
            return gcd(d1, d2 - d1);
        }
    }

    private static int lcm(int d1, int d2) {
         return d1 * d2 / gcd(d1, d2);
    }
}
