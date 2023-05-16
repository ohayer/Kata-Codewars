package Level4;

import java.util.*;

public class ShuffleWords {
    public static Set<String> singlePermutations(String s) {
        List<String> shuffled = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            shuffled.add(String.valueOf(s.charAt(i)));
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length() * 10000; i++) {
            Collections.shuffle(shuffled);
            for (int j = 0; j < shuffled.size(); j++) {
                sb.append(shuffled.get(j));
                if (sb.length() == shuffled.size()) {
                    set.add(sb.toString());
                }
                if (sb.length() == shuffled.size()) {
                    sb.setLength(0);
                }
            }
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(singlePermutations("ab"));
    }
}
