package Level5;

public class JosephusSurvivor {
    //Todo: Finish this method
    public static int josephusSurvivor(final int n, final int k) {
        String[] strings = String.valueOf(n).split("");
        int place = k - 1;
        StringBuilder result = new StringBuilder(new String());
        while (result.length() > 1) {
            for (int i = 0; i < strings.length; i++) {
                if (place != i) {
                    result.append(strings[i]);
                } else {
                    place += 3;
                    if (place > strings.length) {
                        place = place - strings.length;
                    }
                }
                System.out.println(place);
            }
        }
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(josephusSurvivor(1234567, 3));
    }
}
