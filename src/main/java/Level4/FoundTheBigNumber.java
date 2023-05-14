package Level4;

import java.util.Arrays;

public class FoundTheBigNumber {

    //ToDo: Finish this method
    public static long nextBiggerNumber(long n) {
        long lenght = String.valueOf(n).length();
        Long[] numbers = new Long[Math.toIntExact(lenght)];
        for (long i = lenght-1; i >=0 ; i--) {
            numbers[Math.toIntExact(i)] = n%10;
            n/=10;
        }
        for (int i = 0; i < numbers.length; i++) {
            try{
                if (numbers[i]>numbers[i++]){
                    System.out.println(i);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    return Arrays.stream(numbers).count();
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(12L));
    }
}
