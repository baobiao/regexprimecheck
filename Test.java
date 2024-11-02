public class Test {

    public static void main(String[] args) {
        int n = 1000003;
        System.out.println("Testing ["+n+"] " + isPrime(n));
    }

    /**
     * Returns True if N is a prime number, False if it is not a prime number.
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        return !new String(new char[n]).matches(".?|(..+?)\\1+");
    }
}