import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
            map.put(str2.charAt(i), map.getOrDefault(str2.charAt(i), 0) - 1);
        }

        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));  
        System.out.println(isAnagram("hello", "world"));    
    }
}
