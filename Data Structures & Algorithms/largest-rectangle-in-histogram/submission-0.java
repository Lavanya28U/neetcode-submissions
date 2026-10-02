class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<Integer>();
        int maxArea=0;
        for(int i=0;i<=heights.length;i++)
        {
            int ch=(i==heights.length)?0:heights[i];
            while(!stack.isEmpty() && ch<heights[stack.peek()]){
                int h=heights[stack.pop()];
                int w;
                if(stack.isEmpty()){
                    w=i;
                }
                else{
                    w=i-stack.peek()-1;

                }
                int a=w*h;
                maxArea=Math.max(a,maxArea);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
