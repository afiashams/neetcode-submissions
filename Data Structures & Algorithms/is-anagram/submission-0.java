class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> smap = new HashMap();
        HashMap<Character, Integer> tmap = new HashMap();

        char sArray[];
        char tArray[];
        if( s == null || t == null ){
            return false;
        }
        sArray = s.toCharArray();
        tArray = t.toCharArray();
        if( sArray.length != tArray.length ){
            return false;
        }

        for( int i=0; i < tArray.length; i++ ){
            if(smap.containsKey(sArray[i])){
                smap.put(sArray[i], smap.get(sArray[i])+1);
            }
            else if(!smap.containsKey(sArray[i])){
                smap.put(sArray[i], 0);
            }
            if(tmap.containsKey(tArray[i])){
                tmap.put(tArray[i], tmap.get(tArray[i])+1);
            }
            else if(!tmap.containsKey(tArray[i])){
                tmap.put(tArray[i], 0);
            }

        }
        if( smap.equals(tmap)){
            return true;
        }
       return false;

    }
    // we can also use getOrDefault for followin if else

    /* if(tmap.containsKey(tArray[i])){
            tmap.put(tArray[i], tmap.get(tArray[i])+1);
        }
        else if(!tmap.containsKey(tArray[i])){
            tmap.put(tArray[i], 0);

        
        tmap.getOrDefault(tArray[i],0); // it return 0 if key - tArray[i] does not exist and if key - tArray[i] exists then it returns corresponding value
        smap.put(sArray[i], smap.getOrDefault(sArray[i], 0) + 1);
            
    }*/
}
