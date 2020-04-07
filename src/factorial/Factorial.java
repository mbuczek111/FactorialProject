package factorial;

public class Factorial {
    public static long factorial(int num)
    {
        if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
    }
}
