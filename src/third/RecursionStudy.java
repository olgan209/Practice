package third;

public class RecursionStudy {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(power(2, 5));
    }
    public static int factorial(int value) {
        if(value < 1) return 1;
        return value * factorial(value - 1);
    }
    public static int power(int base, int exponent) {
        if (exponent < 1) return 1; // base case
        return base * power(base , exponent);
    }
}
