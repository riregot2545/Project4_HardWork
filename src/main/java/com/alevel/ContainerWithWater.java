package com.alevel;

public class ContainerWithWater {
    public int maxArea(int[] height) {
        int absMaximum = 0;
        for (int i = 0,j=height.length-1; i!=j;) {
            int localMaximum = Math.min(height[i],height[j])*(j-i);
            if(localMaximum>absMaximum)
                absMaximum = localMaximum;
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return absMaximum;
    }
}
