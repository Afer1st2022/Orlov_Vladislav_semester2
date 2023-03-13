package task7;
import java.util.Scanner;

public class CalculateResult {
    public static int GetNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        return number;
    }
    public static int CalculateResult(int number) {
        int moreSqrt = (int) Math.ceil(Math.sqrt(number));
        int lessSqrt = (int) Math.floor(Math.sqrt(number));
        int result = (number - (Math.pow(moreSqrt, 2))) > (number - (Math.pow(lessSqrt, 2))) ? moreSqrt : lessSqrt;
        return result;
    }
}
