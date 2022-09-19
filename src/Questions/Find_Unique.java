package Questions;

public class Find_Unique {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,4,6};

        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for (int n:
             arr) {
            unique ^= n;
        }
        return unique;
    }
}
