package tasks.task25;

import java.util.Arrays;

public class MainTask25 {
    public static void main(String[] args) {
        int[] elements = ScannerTask25.getNumbers();
        int start = elements[0];
        int end = elements[1];
        int[] dividers = MethodTask25.getDividers(elements);
        MethodTask25 testRow = new MethodTask25(start, end);
        System.out.println("Ряд: " + Arrays.toString(testRow.getRow()));
        System.out.println("Сумма: " + testRow.calculateSum(dividers));
    }
}
