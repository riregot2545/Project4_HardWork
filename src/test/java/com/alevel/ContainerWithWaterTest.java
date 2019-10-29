package com.alevel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithWaterTest {

    ContainerWithWater containerWithWater = new ContainerWithWater();

    @Test
    public void maxArea() {
        int [] testMassiveNormal = {1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(49,containerWithWater.maxArea(testMassiveNormal));
    }
}