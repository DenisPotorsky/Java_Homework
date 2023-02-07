import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class NamesList {
    public static void main(String[] args) {

        String[] n = {"Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };
        List<String> sortedNames = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        HashMap<String, Integer> counter = new HashMap<>();
        List<String> allNames = new ArrayList<>();

        for (String s : n) {
            String[] nameSurname = s.split(" ");
            allNames.add(nameSurname[0]);
            if (counter.containsKey(nameSurname[0])) {
                counter.computeIfPresent(nameSurname[0], (k, v) -> v + 1);
            } else {
                counter.put(nameSurname[0], 1);
                temp.add(nameSurname[0]);
            }
        }
        for (int c = 0; c < counter.size(); c++) {
            int maxValue = 0;
            String maxKey = "";
            for (int i = 0; i < counter.size(); i++) {
                if (counter.get(temp.get(i)) > maxValue) {
                    maxValue = counter.get(temp.get(i));
                    maxKey = temp.get(i);
                }
            }
            if (maxValue > 1) System.out.println(maxKey + " - " + maxValue);
            for (int i = 0; i < n.length; i++) {
                if (allNames.get(i).equals(maxKey)) {
                    sortedNames.add(n[i]);
                }
            }
            counter.replace(maxKey, 0);
        }
        System.out.println();
        for (Iterator<String> i = sortedNames.iterator(); i.hasNext(); ) {
            String item = i.next();
            System.out.println(item);
        }
    }
}
