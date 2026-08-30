class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums ){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> map.get(b).compareTo(map.get(a)));
       

        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i); // Assign by index
        }
        System.out.println(map);

        
        return result;
        
    }
}
