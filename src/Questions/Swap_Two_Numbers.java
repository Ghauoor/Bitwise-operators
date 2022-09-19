package Questions;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("The value of a is: "+ a);
        System.out.println("The value of b is: "+ b);

        System.out.println("After swapping ....");

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("The value of a is: "+ a);
        System.out.print("The value of b is: "+ b);
    }
}
