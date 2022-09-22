package Questions;

public class Count_The_Prime_Numbers {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(countPrimes(n));

    }
    public static int countPrimes(int n) {
        boolean[] primes = new boolean[n+1];

        int count = 0;

        for (int i = 2; i < n; i++) {
            if(!primes[i]){
                count++;

                for (int j = i*2; j < n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        return count;

    }
}
