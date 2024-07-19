package follow_programmercarl.day58;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 109. 冗余连接II
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1182
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class RedundantLink2 {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] father = new int[n + 1];
            int[] inDegree = new int[n + 1];
            int[][] edge = new int[n][2];
            for (int i = 0; i < father.length; i++) {
                father[i] = i;
            }
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                inDegree[b]++;
                edge[i][0] = a;
                edge[i][1] = b;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = n - 1; i >= 0; i--) {
                if (inDegree[edge[i][1]] == 2) {
                    list.add(i);
                }
            }
            if (!list.isEmpty()) {
                if (isTreeAfterRemoveEdge(edge, list.get(0), father)) {
                    System.out.println(edge[list.get(0)][0] + " " + edge[list.get(0)][1]);
                } else {
                    System.out.println(edge[list.get(1)][0] + " " + edge[list.get(1)][1]);
                }
                return;
            }
            getRemoveEdge(edge, father);

        }

        // 删一条边之后判断是不是树
        static boolean isTreeAfterRemoveEdge(int[][] edges, int deleteEdge, int[] father) {
            for (int i = 0; i < edges.length; i++) {
                if (i == deleteEdge) {
                    continue;
                }
                if (isSame(edges[i][0], edges[i][1], father)) { // 构成有向环了，一定不是树
                    return false;
                }
                join(edges[i][0], edges[i][1], father);
            }
            return true;
        }

        private static void getRemoveEdge(int[][] edges, int[] father) {
            for (int[] edge : edges) {
                if (isSame(edge[0], edge[1], father)) {
                    System.out.println(edge[0] + " " + edge[1]);
                    return;
                } else {
                    join(edge[0], edge[1], father);
                }
            }
        }

        private static int find(int a, int[] father) {
            if (father[a] == a) {
                return a;
            } else {
                return find(father[a], father);
            }
        }

        private static void join(int a, int b, int[] father) {
            a = find(a, father);
            b = find(b, father);
            if (a == b) {
                return;
            }
            father[b] = a;
        }

        private static boolean isSame(int a, int b, int[] father) {
            return find(a, father) == find(b, father);
        }
    }
}
