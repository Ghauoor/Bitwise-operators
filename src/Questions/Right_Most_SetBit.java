package Questions;

public class Right_Most_SetBit {
    public static void main(String[] args) {
        int n = 9;

        System.out.println(getFirstSetBitPos(n));


    }
    public static int getFirstSetBitPos(int n) {
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
    }

}
