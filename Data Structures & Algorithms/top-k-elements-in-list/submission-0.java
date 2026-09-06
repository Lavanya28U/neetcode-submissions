class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int kl:nums){
            if(!map.containsKey(kl)){
                map.put(kl,1);
            }
            else{
            map.put(kl,map.get(kl)+1);}
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[0];
        }
        return ans;
       
}

    }

