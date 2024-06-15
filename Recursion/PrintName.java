public class PrintName {
    public static void main(String[] args) {
        int n = 5;
        fun(1, n);
    }

    static void fun(int i, int n) {
        if (i > n) return;
        System.out.println("Het");
        fun(i + 1, n);
    }
}