package tasks.task27;
import java.util.Scanner;
public class MainTask27 {
    public static String[] scannerFunction() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите через пробел строку, сдвиг и направление (\"влево\", \"вправо\"): ");
        return in.nextLine().split(" ");
    }
    public static void main(String[] args) {
        String[] a = scannerFunction();
        MethodTask27 line = new MethodTask27(a[0], Integer.parseInt(a[1]), a[2]);
        System.out.println(line.encrypt());
    }
}