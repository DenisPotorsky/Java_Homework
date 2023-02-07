import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> pb = new HashMap<String, ArrayList<String>>();
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (true) {
            while (true) {
                try {
                    System.out.println("Выберите пункт меню: ");
                    System.out.println("1. Просмотр телефонной книги");
                    System.out.println("2. Добавление записи");
                    System.out.println("3. Выход из меню \n");
                    input = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Введите верное число!");
                    e.printStackTrace();
                }
            }
            if (input == 1) {
                if (pb.size() == 0) {
                    System.out.println("Телефоннcая книга пуста \n");
                } else {
                    pb.entrySet().forEach(entry -> {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    });
                }

            } else if (input == 2) {
                System.out.println("Введите имя контакта: \n");
                String name = sc.next();
                while (true) {
                    if (pb.containsKey(name)) {
                        System.out.println("Контакт с таким именем уже существует, хотите добавить номер телефона? \n 1. ДА \n 2. НЕТ");
                        String inp = sc.next();
                        if (inp.equals("1")) {
                            System.out.println("Введите номер телефона: \n");
                            String number = sc.next();
                            addToList(name, number, pb);
                            break;
                        } else break;
                    } else {
                        System.out.println("Введите номер телефона: \n");
                        String number = sc.next();
                        addToList(name, number, pb);
                        break;
                    }
                }
            } else {
                sc.close();
                break;
            }
        }

    }

    public static void addToList(String mapKey, String myItem, HashMap<String, ArrayList<String>> pb) {
        ArrayList<String> itemsList = pb.get(mapKey);
        if (itemsList == null) {
            itemsList = new ArrayList<String>();
            itemsList.add(myItem);
            pb.put(mapKey, itemsList);
        } else {
            if (!itemsList.contains(myItem)) itemsList.add(myItem);
        }
    }
}
