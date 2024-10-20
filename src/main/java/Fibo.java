public class Fibo {
    public static int fibon(int n) {
        if (n <= 1) {
            return n;
        }
        return fibon(n - 1) + fibon(n - 2);
    }
}
