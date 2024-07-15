package follow_programmercarl.day52;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 98. 所有可达路径
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1170
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class AllPath {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] graph = new int[n + 1][n + 1];
            for (int i = 0; i < m; i++) {
                int start = scanner.nextInt();
                int target = scanner.nextInt();
                graph[start][target] = 1;
            }
            temp.add(1);
            dfs(graph, 1, n);
            if (paths.size() == 0) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < paths.size(); i++) {
                    List<Integer> path = paths.get(i);
                    for (int j = 0; j < path.size(); j++) {
                        System.out.printf("" + path.get(j));
                        if (j != path.size() - 1) {
                            System.out.printf(" -> ");
                        }
                    }
                    if (i != paths.size() - 1) {
                        System.out.println();
                    }
                }
            }
        }

        static List<List<Integer>> paths = new ArrayList<>();
        static List<Integer> temp = new ArrayList<>();

        private static void dfs(int[][] graph, int start, int target) {
            if (start == target) {
                paths.add(new ArrayList<>(temp));
                return;
            }
            for (int i = 1; i <= target; i++) {
                if (graph[start][i] == 1) {
                    temp.add(i);
                    dfs(graph, i, target);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
}
