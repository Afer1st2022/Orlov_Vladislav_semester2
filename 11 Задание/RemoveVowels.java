package tasks.task11;
import java.util.Locale;
import java.util.Scanner;
public class RemoveVowels {
    public static String RemoveVowels() {
        String[] allRussianVowelsLow = {"а", "о", "у", "ы", "э", "е", "ё", "и", "ю", "я"};
        String[] allRussianVowelsHigh = {"А", "О", "У", "Ы", "Э", "Е", "Ё", "И", "Ю", "Я"};
        String[] allEnglishVowelsHigh = {"A", "E", "I", "O", "U", "Y"};
        String[] allEnglishVowelsLow = {"a", "e", "i", "o", "u", "y"};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку из которой желаете удалить все гласные: ");
        String line = in.nextLine();
        for (int i = 0; i < allRussianVowelsHigh.length; i++) {
            line = line.replace(allRussianVowelsHigh[i], "");
            line = line.replace(allRussianVowelsLow[i], "");
        }
        for (int j = 0; j < allEnglishVowelsHigh.length; j++) {
            line = line.replace(allEnglishVowelsHigh[j], "");
            line = line.replace(allEnglishVowelsLow[j], "");
        }
        return line;
    }
}
