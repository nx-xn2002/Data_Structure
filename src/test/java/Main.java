public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((100 * i + j) % 11 == 0) {
                    System.out.println("i:" + i + ",j:" + j);
                }
            }
        }
    }
}
