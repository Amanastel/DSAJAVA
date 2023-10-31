package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String magazine = "aa";
        String note = "aab";



        System.out.println(checkMagazine(magazine, note));
        System.out.println(checkMagazine("give me one grand today night", "give one grand today"));
    }

    public static Boolean checkMagazine(String magazine, String ransomNote) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);

            }else{
                map.put(magazine.charAt(i), 1);
            }
        }
//        System.out.println(map.entrySet());
//        return true;
        int count = 0;
        for (int i =0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch, map.get(ch)-1);
                count++;
            }else{
                break;
            }
        }
        if(count == ransomNote.length()){
            return true;

        }else{
            return false;
        }
    }
}
