package tasks.task29;

import java.util.Scanner;

public class MainTask29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите через пробел число и начало ряда");
        String[] b = in.nextLine().split(" ");
        MethodsTask29 a = new MethodsTask29(Integer.parseInt(b[1]), Integer.parseInt(b[0]));
        System.out.println(a.getResult());
    }
}
