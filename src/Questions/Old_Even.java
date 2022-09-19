package Questions;

public class Old_Even {
    public static void main(String[] args) {
        int n = 22;
        if(!isOdd(n)){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

    }
    private static boolean isOdd(int n){
        return (n & 1) ==1;
    }

}
