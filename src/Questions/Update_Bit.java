package Questions;

import java.util.Scanner;

public class Update_Bit {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();// update bit to one else zer0;

        int pos = 1;
        int bitMask = 1 << pos;

        if (oper == 1){
            //set operation
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);

            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
