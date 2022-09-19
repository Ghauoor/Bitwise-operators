package Questions;

public class No_Of_Digits {
    public static void main(String[] args) {
        int n = 34545;
        int base = 10;

        int ans = (int)(Math.log(n) / Math.log(base)) + 1;

        System.out.println(ans);

    }
}
