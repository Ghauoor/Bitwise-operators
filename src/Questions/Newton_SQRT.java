package Questions;

public class Newton_SQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f",sqrt(40));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while (true){
             root = 0.5 * (x + (n / x));
             // Error Alowed --> < 1
            if (Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }

        return root;
    }
}
