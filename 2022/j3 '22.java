import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                System.out.print(temp + " ");
                temp = "";
            }
            temp += s.charAt(i);
        }
        System.out.println(temp);
    }
}
