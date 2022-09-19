package Questions;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.print("Enter the Number You want to check: ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean ans = n > 0 && (n & n - 1) == 0;
        System.out.println(ans);
    }
}
