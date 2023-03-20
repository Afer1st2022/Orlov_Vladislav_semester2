package tasks.task21;
import java.util.Scanner;
public class NumpadSolution {
    public static String GetLineTask21() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return in.nextLine();
    }
    public static String SolveLine(String line) {
        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)) {
                case ('1') -> line = line.substring(0, i) + '7' + line.substring(i + 1);
                case ('2') -> line = line.substring(0, i) + '8' + line.substring(i + 1);
                case ('3') -> line = line.substring(0, i) + '9' + line.substring(i + 1);
                case ('7') -> line = line.substring(0, i) + '1' + line.substring(i + 1);
                case ('8') -> line = line.substring(0, i) + '2' + line.substring(i + 1);
                case ('9') -> line = line.substring(0, i) + '3' + line.substring(i + 1);
            }
        }
        return line;
    }
    public static void GetResultTask21() {
        System.out.println(SolveLine(GetLineTask21()));
    }
}
