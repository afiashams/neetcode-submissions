class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int totalCarFleet = 0;
        Stack<Double> timeStack = new Stack();
        int n=position.length;

        // we will sort based on positions
        // Pair up position and speed for each car
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Sort cars by position in ascending order
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
        
        for( int i=n-1; i>=0; i-- ){
            Double time = (double)((double)(target-cars[i][0])/cars[i][1]);
            if( timeStack.size() == 0 ){
                totalCarFleet ++;
                timeStack.push(time);
            }
            else if(time > timeStack.peek()  ){
                totalCarFleet++;
                timeStack.push(time);
            }
             


        }
        return totalCarFleet;
        
    }
}
