import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if(pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> hm = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);

            boolean containsKey = hm.containsKey(ch);

            if(!containsKey && hm.containsValue(arr[i])) {
                return false;
            }

            if(containsKey) {

                if(!hm.get(ch).equals(arr[i])) {
                    return false;
                }

            } else {

                hm.put(ch, arr[i]);
            }
        }

        return true;
    }
}