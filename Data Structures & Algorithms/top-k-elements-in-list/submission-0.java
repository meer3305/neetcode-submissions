class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Bucket array
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : count.keySet()) {
            int freq = count.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Collect top k
        List<Integer> res = new ArrayList<>();

        for (int i = bucket.length - 1; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null) {
                res.addAll(bucket[i]);
            }
        }

        // Convert to array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}