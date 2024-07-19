package follow_programmercarl.day58;

import java.util.Scanner;

/**
 * 108. 冗余连接
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1181
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class RedundantLink {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] father = new int[n + 1];
            for (int i = 0; i < father.length; i++) {
                father[i] = i;
            }
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (isSame(a, b, father)) {
                    System.out.println(a + " " + b);
                    return;
                } else {
                    join(a, b, father);
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
