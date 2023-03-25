package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoNumbers {
    public static void main(String args[]) {
        int[] numarr = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int ressum = 10;

        // resultant sum =10

        // method one brute force.
        System.out.println("method one brute force");

        for (int p = 0; p < numarr.length; p++) {
            int currentouter = numarr[p];
            for (int k = 0; k < numarr.length; k++) {
                int currinn = numarr[k];
                if (p != k && (currinn + currentouter == ressum)) {
                    System.out.println("the combination of numbers are  :" + currinn + "  " + currentouter);

                }

            }

        }
        System.out.println("method two sorted array method");

        int[] sortedNumbers = Arrays.copyOf(numarr, numarr.length);
        Arrays.sort(sortedNumbers);

        int lhs = 0;
        int rhs = sortedNumbers.length - 1;

        int resnum = 10;

        while (lhs < rhs) {
            if (sortedNumbers[lhs] + sortedNumbers[rhs] == resnum) {
                System.out.println("the combination of numbers are" + sortedNumbers[lhs] + " " + sortedNumbers[rhs]);
                break;
            } else if (sortedNumbers[lhs] + sortedNumbers[rhs] < resnum) {
                lhs++;
            } else if (sortedNumbers[lhs] + sortedNumbers[rhs] > resnum) {
                rhs++;
            }
        }

    }
}
