import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Di Zhu
 * @Date: 04-20-2019 12:07
 * @Description:
 */
public class Solution13 {
    //罗马数字转整数
    //23ms, 91.41%
    //36MB, 98.96%
    public static int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        Map<String, Integer> map = new HashMap();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);    //IV
        map.put("IX", 9);    //IX
        map.put("XL", 40);   //XL
        map.put("XC", 90);   //XC
        map.put("CD", 400);  //CD
        map.put("CM", 900);  //CM

        for(int i = 0 ; i < length ; i++) {
            if (i + 1 < length) {
                String twoDigit = s.substring(i, i + 2);
                if (map.containsKey(twoDigit)) {
                    result += map.get(twoDigit);
                    i++;
                } else {
                    result += map.get(s.substring(i, i + 1));
                }
            } else {
                result += map.get(s.substring(i, i + 1));
            }
        }
        return result;
    }
}
