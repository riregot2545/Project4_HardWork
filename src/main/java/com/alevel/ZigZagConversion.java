package com.alevel;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if(s.length()==0)
            return "";
        if(numRows == 1)
            return s;
        String[] stringBuffers = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuffers[i] = "";
        }

        for (int i = 0; i < s.length();) {
            //forward
            for (int j = 0; j < numRows && i < s.length(); j++,i++) {
                stringBuffers[j]+=s.charAt(i);
            }
            //zigzag
            for (int j = numRows-2; j >0 && i < s.length(); j--,i++) {
                stringBuffers[j]+=s.charAt(i);
            }

        }
        StringBuilder builder = new StringBuilder();
        for (String str :
                stringBuffers) {
            builder.append(str);
        }
        return builder.toString();
    }
}
