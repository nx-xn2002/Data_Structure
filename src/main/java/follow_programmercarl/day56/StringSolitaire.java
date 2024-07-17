package follow_programmercarl.day56;

import java.util.*;

/**
 * 110. 字符串接龙
 * <p>
 * LeetCode题目链接：https://kamacoder.com/problempage.php?pid=1183
 * 个人博客：http://myblog.nxx.nx.cn
 * GitHub地址：https://github.com/nx-xn2002/Data_Structure.git
 *
 * @author Ni Xiang
 */
public class StringSolitaire {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            HashSet<String> set = new HashSet<>(n);
            String begin = scanner.next();
            String end = scanner.next();
            for (int i = 0; i < n; i++) {
                set.add(scanner.nextLine());
            }
            if (begin.equals(end)) {
                System.out.println(0);
                return;
            }
            HashMap<String, Integer> map = new HashMap<>(n);
            Queue<String> queue = new LinkedList<>();
            queue.add(begin);
            while (!queue.isEmpty()) {
                String str = queue.poll();
                Integer path = map.getOrDefault(str, 1);
                for (int i = 0; i < str.length(); i++) {
                    char[] charArray = str.toCharArray();
                    for (int j = 0; j < 26; j++) {
                        charArray[i] = (char) ('a' + j);
                        String s = String.valueOf(charArray);
                        if (s.equals(end)) {
                            System.out.println(path + 1);
                            return;
                        }
                        if (set.contains(s) && !map.containsKey(s)) {
                            map.put(s, path + 1);
                            queue.add(s);
                        }
                    }
                }
            }
            System.out.println(0);
        }
    }
}
