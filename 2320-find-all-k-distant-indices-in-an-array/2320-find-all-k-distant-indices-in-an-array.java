class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(n - 1, i + k);
                for (int j = start; j <= end; j++) {
                    set.add(j);
                }
            }
        }

        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res); // Required as output must be sorted
        return res;
    }
}