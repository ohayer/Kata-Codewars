package Level5;

import java.util.ArrayList;
import java.util.List;

public class PigLatin {
//    Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//
//Examples
//pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//pigIt('Hello world !');     // elloHay orldway !
    public static String pigIt(String str) {
        String[] s = str.split(" ");
        List<String> list = new ArrayList<>();
        for (String e : s) {
            char c = e.charAt(0);
            if (!Character.isLetter(c)) {
                list.add(String.valueOf(c));
            } else {
                String string = e.substring(1) + c + "ay";
                list.add(string);
            }
        }
        return String.join(" ", list);
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
        System.out.println(pigIt("Pig latin is cool"));
    }
}
