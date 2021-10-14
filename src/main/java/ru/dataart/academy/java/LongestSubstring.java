package ru.dataart.academy.java;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        //Task implementation
        int res;
        if (checkString == null || checkString.equals(""))
            return 0;
        else res = 1;
        int count = 1;
        HashSet<Character> uniqueChar = new HashSet();
        int j;
        int i = 0;
        while ( i < checkString.length() && (checkString.length() - i) > res) {
            count = 0;
            uniqueChar.clear();
            j = i;
            while (j < checkString.length() && !uniqueChar.contains(checkString.charAt(j))) {
                uniqueChar.add(checkString.charAt(j));
                count++;
                j++;
            }
            if (count > res)
                res = count;

            i++;
        }
        return res;
    }
}
