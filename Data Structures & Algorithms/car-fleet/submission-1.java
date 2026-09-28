class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] car=new double[n][2];
        for(int i=0;i<n;i++)
        {
            car[i][0]=position[i];
            car[i][1]=(double)(target-position[i])/speed[i];

        }
         Arrays.sort(car, (a, b) -> Double.compare(b[0], a[0]));
         int fleet=0;
         double maxtime=0;
         for(int i=0;i<n;i++){
            if(car[i][1]>maxtime){
                fleet++;
                maxtime=car[i][1];
            }
         }
         return fleet;
    }
}
