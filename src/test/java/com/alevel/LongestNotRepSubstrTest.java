package com.alevel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestNotRepSubstrTest {

    LongestNotRepSubstr longestNotRepSubstr = new LongestNotRepSubstr();
    @Test
    public void lengthOfLongestSubstring() {
        String testingStrNormal = "dvdf";
        String testingStrAlwaysRepeat = "aaaaaaaaaaaa";
        String testingStrUnique = "qwertyuiopasdfghjklzxcvbnm";
        String testingStrEmpty = "";
        Assert.assertEquals(3,longestNotRepSubstr.lengthOfLongestSubstring(testingStrNormal));
        Assert.assertEquals(1,longestNotRepSubstr.lengthOfLongestSubstring(testingStrAlwaysRepeat));
        Assert.assertEquals(26,longestNotRepSubstr.lengthOfLongestSubstring(testingStrUnique));
        Assert.assertEquals(0,longestNotRepSubstr.lengthOfLongestSubstring(testingStrEmpty));
    }
}