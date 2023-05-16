package Level5;

import java.util.Arrays;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        int[] result = new int[2];
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            for (int j = 2; j < Integer.MAX_VALUE; j++) {
                if (Math.pow(i, j) == n) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] pp = {4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484};
        for (int i = 0; i < pp.length; i++) {
            System.out.println(Arrays.toString(isPerfectPower(pp[i])));
        }
        System.out.println(Arrays.toString(isPerfectPower(0)));
    }
}
