package Questions;

public class GCD {
    public static void main(String[] args) {

        System.out.println(gcd(4,8));
        System.out.println(gCD(4,8));
    }

    static int gcd(int a, int b){

        if(a == 0) return b;


        return gcd(b%a, a);
    }

    static int gCD(int a, int b){
        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;
        }

        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
