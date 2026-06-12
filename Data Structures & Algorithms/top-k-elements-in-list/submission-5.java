class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
     List<Integer> uniqueNums = new ArrayList<>(frequencyMap.keySet());
        uniqueNums.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < k; i++) {
            result.add(uniqueNums.get(i));
        }

    int[] intArray = result.stream()
    .mapToInt(Integer::intValue)
    .toArray();
       return intArray;
    }
}
