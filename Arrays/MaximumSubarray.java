package Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] ar = { -2, 1, -3, 4, -1 };
        MaximumSubarray obj = new MaximumSubarray();
        System.out.println(obj.cubic(ar));
        System.out.println(obj.square(ar));
        System.out.println(obj.kadanes(ar));
    }

    private int square(int[] ar) {
        int gloMax = 0;
        for (int i = 0; i < ar.length; i++) {
            int locMax = 0;
            for (int j = i; j < ar.length; j++) {
                locMax += ar[j];
                if (locMax > gloMax) {
                    gloMax = locMax;
                }
            }
        }
        return gloMax;
    }

    private int kadanes(int[] ar) {
        int locMax = 0;
        int gloMax = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {

            locMax = Math.max(locMax + ar[i], ar[i]);
            if (locMax > gloMax) {
                gloMax = locMax;
            }
        }
        return gloMax;
    }

    private int max(int a, int b) {
        int max = a;
        if (b > a) {
            max = b;
        }
        return max;
    }

    private int cubic(int[] ar) {
        int gloMax = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                int locMax = 0;
                for (int j2 = i; j2 < j + 1; j2++) {
                    locMax += ar[j2];
                }
                if (locMax > gloMax) {
                    gloMax = locMax;
                }
            }
        }
        return gloMax;
    }
}
