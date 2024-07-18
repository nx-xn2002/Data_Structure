package follow_programmercarl.day57;

import java.util.Scanner;

/**
 * 107. 寻找存在的路径
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1179
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class FindExistPath {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] father = new int[n + 1];
            init(father);
            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                join(a, b, father);
            }
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            if (isSame(start, end, father)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        private static void init(int[] father) {
            for (int i = 0; i < father.length; i++) {
                father[i] = i;
            }
        }

        private static int find(int n, int[] father) {
            if (n == father[n]) {
                return n;
            } else {
                return find(father[n], father);
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
