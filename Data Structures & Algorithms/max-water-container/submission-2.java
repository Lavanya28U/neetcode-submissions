class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int m=0;
        while(l<r){
            int width=r-l;
            int height=Math.min(heights[l],heights[r]);
            int a=width*height;
            m=Math.max(a,m);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return m;
    }
}
