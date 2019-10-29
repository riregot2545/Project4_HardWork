package com.alevel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    ZigZagConversion zigZagConversion = new ZigZagConversion();
    @Test
    public void convert() {
        String testStringNormal = "PAYPALISHIRING";
        int numRowsNormal = 3;
        String testStringEmpty = "";
        int numRowsEmpty = 2;
        String testStringOne = "";
        int numRowsOne = 1;
        Assert.assertEquals("PAHNAPLSIIGYIR",zigZagConversion.convert(testStringNormal,numRowsNormal));
        Assert.assertEquals("",zigZagConversion.convert(testStringEmpty,numRowsEmpty));
        Assert.assertEquals("A",zigZagConversion.convert(testStringOne,numRowsOne));
    }
}