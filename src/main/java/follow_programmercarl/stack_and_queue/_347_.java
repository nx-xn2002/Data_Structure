package follow_programmercarl.stack_and_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 347. 前 K 个高频元素
 *
 * @author nx
 */
public class _347_ {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((item1, item2) -> (item2[1] - item1[1]));
        for (Integer integer : map.keySet()) {
            pq.add(new int[]{integer, map.get(integer)});
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
