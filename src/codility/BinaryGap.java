package codility;

import java.util.*;

public class BinaryGap {

    private int testCase1 = 143;
    private int testCase2 = 555;

    public int doBinaryGap(int num) {

        return 0;
    }

    public int sampleBinaryGap(int num) {
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        char[] bits = Integer.toBinaryString(num).toCharArray();

        for (char c : bits) {
            if (c == '1') {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                currentGap = 0;
                counting = true;
            } else if (counting) {
                currentGap++;
            }
        }

        System.out.println("Binary String: " + Integer.toBinaryString(num));
        System.out.println("Max Gap: " + maxGap);
        return maxGap;
    }
}
