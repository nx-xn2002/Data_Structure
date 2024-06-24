package follow_programmercarl.day33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 763. 划分字母区间
 * <p>
 * LeetCode题目链接：https://leetcode.cn/problems/partition-labels/
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class PartitionLabels {
    static class Solution {
        public List<Integer> partitionLabels(String s) {
            List<Integer> res = new ArrayList<>();
            int[] map = new int[26];
            for (int i = 0; i < s.length(); i++) {
                map[s.charAt(i) - 'a']++;
            }
            HashSet<Character> letters = new HashSet<>();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                count++;
                map[s.charAt(i) - 'a']--;
                if (map[s.charAt(i) - 'a'] == 0) {
                    if (!letters.isEmpty()) {
                        letters.remove(s.charAt(i));
                    }
                } else {
                    letters.add(s.charAt(i));
                }
                if (letters.isEmpty()) {
                    res.add(count);
                    count = 0;
                }
            }
            if (count != 0) {
                res.add(count);
            }
            return res;
        }
    }
}
