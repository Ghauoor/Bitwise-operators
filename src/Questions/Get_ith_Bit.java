package Questions;

public class Get_ith_Bit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 3;

        int bitMask = 1 << pos;

        if ((bitMask & n) == 0){
            System.out.println("Bit was Zero");
        } else {
            System.out.println("Bit was One");
        }
    }
}
