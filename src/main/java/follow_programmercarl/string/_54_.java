package follow_programmercarl.string;


import java.util.Scanner;

public class _54_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            if (c >= 0 && c <= 9) {
                sb.append("number");
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
