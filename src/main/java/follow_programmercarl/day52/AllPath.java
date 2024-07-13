package follow_programmercarl.day52;

import java.util.ArrayList;
import java.util.Arrays;
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
        static List<List<Integer>> paths = new ArrayList<>();
        static List<Integer> temp = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            //起点
            boolean[] startPoint = new boolean[n + 1];
            Arrays.fill(startPoint, true);
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < m; i++) {
                int start = scanner.nextInt();
                int target = scanner.nextInt();
                graph.get(start).add(target);
                startPoint[target] = false;
            }
            int count = 0;
            for (int i = 1; i < startPoint.length; i++) {
                if (startPoint[i]) {
                    count++;
                    temp.add(i);
                    backtrace(i, graph);
                }
            }
            if (count == 0) {
                System.out.printf("-1");
                return;
            }
            for (int i = 0; i < paths.size(); i++) {
                List<Integer> path = paths.get(i);
                for (int j = 0; j < path.size(); j++) {
                    System.out.printf("" + path.get(j));
                    if (j != path.size() - 1) {
                        System.out.printf(" ");
                    }
                }
                if (i != paths.size() - 1) {
                    System.out.println();
                }
            }
        }

        private static void backtrace(int start, List<List<Integer>> graph) {
            if (graph.get(start).isEmpty()) {
                paths.add(new ArrayList<>(temp));
                return;
            }
            for (Integer target : graph.get(start)) {
                temp.add(target);
                backtrace(target, graph);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
