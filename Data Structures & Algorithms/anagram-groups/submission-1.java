class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap();

        for(  String str : strs ){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
       
        map.get(key).add(str);


        }
        for( String str : map.keySet() ){
            result.add(map.get(str));
        }
        
        return result;
        
    }
}
