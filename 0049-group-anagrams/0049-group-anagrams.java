class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String originalStr = strs[i];

             char [] strCh = originalStr.toCharArray();

             Arrays.sort(strCh);

             String key = new String(strCh);

             if(map.containsKey(key)){
                map.get(key).add(originalStr);
             }else{
                List<String>l = new ArrayList<>();

                l.add(originalStr);

                map.put(key, l);
             }
        }

        return new ArrayList<>(map.values());
    }
}