package Level4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FoundTheBigNumber {

    public static long nextBiggerNumber(long n) {
        long l1 = String.valueOf(n).length();
        Long[] numbers = new Long[Math.toIntExact(l1)];
        Arrays.stream(numbers).sorted();
        for (long i = l1-1; i >=0 ; i--) {
            numbers[Math.toIntExact(i)] = n%10;
            n/=10;
        }
        List<Long> list = new ArrayList<>(Arrays.asList(numbers));
        Collections.reverse(list);
    long result = list.stream().mapToLong(Long::valueOf)
            .reduce(0L, (a, b) -> Long.parseLong(String.valueOf(a) + String.valueOf(b)));;
    return result;
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(12L));
        System.out.println(nextBiggerNumber(2017));
    }
}
