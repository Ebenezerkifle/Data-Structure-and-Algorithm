class Solution {
    public int shortestSubarray(int[] nums, int k) {
        //prefix sum algorithm is used.
        long[] sums = new long[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sums[i+1] = sums[i] + nums[i];
        }
                               
        int shortest = Integer.MAX_VALUE;
                               
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < sums.length; i++) {
            while (!deque.isEmpty() && sums[i]-sums[deque.peekFirst()] >= k) {
                shortest = Math.min(shortest, i-deque.pollFirst());
            }
			//This is a bit tricky. Removing equal or larger sums at previous indices is safe since they won't contribute to valid answers. 
			//Let's say we have two indexes i1 and i2 , where i1 < i2 and sums[i1] = sums[i2].
			//Our current index is j. Then the shortest subarray length can only be j - i2. Same thing if sums[i1] > sums[i2].
            while (!deque.isEmpty() && sums[deque.peekLast()] >= sums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
        }
                               
        return shortest == Integer.MAX_VALUE ? -1 : shortest;
   
    }
}
