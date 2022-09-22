package Questions;

public class Prime_OR_Not {
    public static void main(String[] args) {

        int n = 20;

        for (int i = 1; i <=n ; i++) {
            System.out.println(i + " "+ isPrime(i));
        }

    }
    static boolean isPrime(int n){
        if(n <= 1) return  false;

        int start = 2;

        while (start * start <= n){
            if (n % 2 == 0){
                return false;
            } else {
                start++;
            }
        }
        return true;
    }
}
