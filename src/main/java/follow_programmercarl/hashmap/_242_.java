package follow_programmercarl.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. 有效的字母异位词
 */
public class _242_ {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            int temp = map.getOrDefault(t.charAt(i), 0) - 1;
            if (temp < 0) {
                return false;
            }
            map.put(t.charAt(i), temp);
        }
        return true;
    }
}
