public class recursion {
    private int n;
    private string namee;

    int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        recursion test1 = new recursion();
        int result = test1.fact(5);
        System.out.println(result);

        recursion test2 = new recursion();
        int result2 = test2.fact(4);
        System.out.println(result2);
    }

}
