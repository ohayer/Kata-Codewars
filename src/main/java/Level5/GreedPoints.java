package Level5;

import java.util.Arrays;

public class GreedPoints {
    public static int greedy(int[] dice) {
        if (dice.length != 5) {
            return 0;
        } else {
            int points = 0;
            int[] ints1 = Arrays.stream(dice)
                    .filter(e -> e == 1)
                    .toArray();
            int[] ints2 = Arrays.stream(dice)
                    .filter(e -> e == 2)
                    .toArray();
            int[] ints3 = Arrays.stream(dice)
                    .filter(e -> e == 3)
                    .toArray();
            int[] ints4 = Arrays.stream(dice)
                    .filter(e -> e == 4)
                    .toArray();
            int[] ints5 = Arrays.stream(dice)
                    .filter(e -> e == 5)
                    .toArray();
            int[] ints6 = Arrays.stream(dice)
                    .filter(e -> e == 6)
                    .toArray();

            if (ints2.length >= 3) {
                points += 200;
            }
            if (ints3.length >= 3) {
                points += 300;
            }
            if (ints4.length >= 3) {
                points += 400;
            }
            if (ints6.length >= 3) {
                points += 600;
            }

            switch (ints1.length) {
                case 1 -> points += 100;
                case 2 -> points += 200;
                case 3 -> points += 1000;
                case 4 -> points += 1100;
                case 5 -> points += 1200;
            }
            switch (ints5.length) {
                case 1 -> points += 50;
                case 2 -> points += 100;
                case 3 -> points += 500;
                case 4 -> points += 550;
                case 5 -> points += 600;
            }

            return points;
        }
    }

    public static void main(String[] args) {
        System.out.println(greedy(new int[]{5, 1, 3, 4, 1}));
        System.out.println(greedy(new int[]{1, 1, 1, 3, 1}));
        System.out.println(greedy(new int[]{2, 4, 4, 5, 4}));
        System.out.println(greedy(new int[]{6, 2, 6, 4, 6}));
    }
}
