package task5;
import java.util.Scanner;
public class Calculate {
    public static int[] GetArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа ( в формате 1 3 5 6): ");
        String numbersString = in.nextLine();
        String[] stringArray = numbersString.split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
    public static int CalculateResult(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += (intArray[i] * intArray[i]);
        }
        return sum;
    }
}
