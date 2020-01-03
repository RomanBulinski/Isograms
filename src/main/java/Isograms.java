import java.util.HashMap;
import java.util.Map;

public class Isograms {

    public static boolean isIsogram(String stri) {
        String str = stri.toLowerCase();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), 1);
        }
        return map.size() == str.length();
    }
}
