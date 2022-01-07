public class Lab14q2 {
    public static void main(String[] args) {
        int i = 3;
        while (i < 1000) {
            int n = i + 2;
            if (prime(i) == true && prime(n) == true) {
                System.out.println("(" + i + ", " + n + ")");
                i=i+2;
            }else{
                i=i+2;
            }
        }
    }

    public static Boolean prime(int n) {
        double nd = Double.valueOf(n);
        for (double a = 2; a <= (n / 2); a++) {
            if (nd % a == 0) {
                return false;
            }
        }
        return true;
    }
}