package follow_programmercarl.day61;

import java.util.*;

/**
 * 47. 参加科学大会（第六期模拟笔试）
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1047
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindShortestPath {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            List<List<Edge>> grid = new ArrayList<>(n + 1);
            for (int i = 0; i < n + 1; i++) {
                grid.add(new LinkedList<>());
            }
            int s, e, v;
            for (int i = 0; i < m; i++) {
                s = scanner.nextInt();
                e = scanner.nextInt();
                v = scanner.nextInt();
                List<Edge> edges = grid.get(s);
                edges.add(new Edge(e, v));
            }

            int[] minDist = new int[n + 1];
            Arrays.fill(minDist, Integer.MAX_VALUE);
            boolean[] visited = new boolean[n + 1];
            PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
                }
            });
            queue.offer(new int[]{1, 0});
            minDist[1] = 0;
            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                if (visited[cur[0]]) {
                    continue;
                }
                visited[cur[0]] = true;
                for (Edge edge : grid.get(cur[0])) {
                    if (!visited[edge.to] && minDist[cur[0]] + edge.val < minDist[edge.to]) {
                        minDist[edge.to] = minDist[cur[0]] + edge.val;
                        queue.offer(new int[]{edge.to, minDist[edge.to]});
                    }
                }
            }
            if (Integer.MAX_VALUE == minDist[n]) {
                System.out.print(-1);
            } else {
                System.out.print(minDist[n]);
            }
        }
        static class Edge {
            int to;
            int val;
            public Edge(int to, int val) {
                this.to = to;
                this.val = val;
            }
        }
    }
}
