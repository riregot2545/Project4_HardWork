package com.alevel;


public class LongestNotRepSubstr {

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        int maxLength = 0;
        int startIndex = 0;
        int localLength = 1;
        for (int i = 1; i < s.length(); ) {
            String workingPart = s.substring(startIndex,i);
            String nextSymbol = s.substring(i,i+1);
            if(workingPart.contains(nextSymbol)){
                maxLength = Math.max(maxLength,localLength);
                localLength = 1;
                startIndex = s.indexOf(nextSymbol,startIndex)+1;
                i = startIndex+1;
            }
            else {
                i++;
                localLength++;
            }
        }
       return Math.max(maxLength,localLength);
    }
}
