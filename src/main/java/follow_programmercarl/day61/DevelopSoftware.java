package follow_programmercarl.day61;

import java.util.*;

/**
 * 117. 软件构建
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1191
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class DevelopSoftware {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] inDegree = new int[n + 1];
            List<Integer> res = new ArrayList<>(n);
            Map<Integer, List<Integer>> map = new HashMap<>(n);
            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                inDegree[b]++;
                List<Integer> temp = map.getOrDefault(a, new ArrayList<>());
                temp.add(b);
                map.put(a, temp);
            }
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i < n + 1; i++) {
                if (inDegree[i] == 0) {
                    queue.add(i);
                }
            }
            while (!queue.isEmpty()) {
                int start = queue.poll();
                res.add(start);
                if (map.containsKey(start)) {
                    List<Integer> list = map.get(start);
                    for (Integer end : list) {
                        inDegree[end]--;
                        if (inDegree[end] == 0) {
                            queue.add(end);
                        }
                    }
                }
            }
            if (res.size() == n) {
                for (int i = 0; i < res.size(); i++) {
                    System.out.printf("" + i);
                    if (i != res.size() - 1) {
                        System.out.printf(" ");
                    }
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}
