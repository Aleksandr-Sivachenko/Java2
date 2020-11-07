import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	String[] words = {"Рука","Локоть","Голова","Колено","Щека","Глаз","Рука","Палец","Грудь","Голова","Нога"};
	HashMap<String, Integer> wordMap = new HashMap<>();
	for (String x : words) {
        wordMap.put(x, wordMap.getOrDefault(x, 0) + 1);
    }
        System.out.println(wordMap);

        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Женя");
        phonebook.add(5678794, "Катя");
        phonebook.add(3456783, "Гена");
        phonebook.add(3456278, "Женя");
        phonebook.add(9786053, "Саня");
        phonebook.add(6475893, "Гена");

        phonebook.get("Гена");
        phonebook.get("Саня");
        phonebook.get("Женя");
        phonebook.get("Игорь");

    }
}
