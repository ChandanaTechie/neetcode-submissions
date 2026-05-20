class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> keyAndListSubstring = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            keyAndListSubstring.putIfAbsent(key, new ArrayList<>());
            List<String> list = keyAndListSubstring.get(key);
            list.add(s);
        }

        return new ArrayList<>(keyAndListSubstring.values());
    }
}
