package Level6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CamelCase {
    //    camelCase("hello case"); // => "HelloCase"
//camelCase("camel case word"); // => "CamelCaseWord" Simple output
    public static String camelCase(String str) {
        if (str.isBlank()) {
            return "";
        }
        String[] strings = str.split(" ");
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            try {
                Character c = string.charAt(0);
                if (!Character.isLetter(c)) {
                    continue;
                }
                String s = String.valueOf(c);
                String replace = s.toUpperCase() + string.substring(1);
                list.add(replace);
            } catch (StringIndexOutOfBoundsException e) {
                System.err.println("Error " + e.getMessage() + e.getLocalizedMessage());
            }
        }
        return String.join("", list);
    }

    public static void main(String[] args) {
        System.out.println(camelCase("hello case"));
        System.out.println(camelCase(" camel case word"));
        System.out.println(camelCase("test case"));
        System.out.println(camelCase(" "));
    }
}
