package follow_programmercarl.array.sliding_window;

/**
 * 904. 水果成篮
 *
 * @author nx
 */
public class _904_ {
    public int totalFruit(int[] fruits) {
        int[] types = new int[fruits.length];
        int begin = 0, end = 0, dif = 0, max = 0;
        while (end < fruits.length) {
            types[fruits[end]]++;
            if (types[fruits[end]] == 1) {
                dif += 1;
            }
            while (dif > 2) {
                types[fruits[begin]]--;
                if (types[fruits[begin]] == 0) {
                    dif--;
                }
                begin++;
            }
            end++;
            max = Math.max(max, end - begin);
        }
        return max;
    }
}
