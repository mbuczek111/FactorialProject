package factorial;
import static factorial.Factorial.*;


public class FactorialTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.print(factorial(i) + " ");
    }
}
