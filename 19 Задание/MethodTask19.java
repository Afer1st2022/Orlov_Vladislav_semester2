package tasks.task19;
import java.util.Scanner;
public class MethodTask19 {
    public static void Method() {
        System.out.println(func(GetNumberTask19()));
    }
    public static int func(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) { //n / 2 == (int) n / 2
            return func(n / 2);
        } else {
            return func((n - 1)/ 2) + func(((n - 1) / 2) + 1 );
        }
    }
    public static int GetNumberTask19() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        return in.nextInt();
    }
}