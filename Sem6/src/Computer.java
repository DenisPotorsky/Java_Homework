import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Computer {
    String brand;
    String os;
    int ram;
    int hdd;
    double diagonal;
    double price;

    public Computer(String brand, String os, int ram, int hdd, double diagonal, double price) {
        this.brand = brand;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getOS() {
        return os;
    }

    public int getRAM() {
        return ram;
    }

    public int getHDD() {
        return hdd;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "| " + brand + " | " + os + " | " + ram + " | " + hdd + " | " + diagonal + " | " + price + " |";
    }

    public static void filtering(Set<Computer> cmp) {
        HashMap<Integer, String> filters = new HashMap<>();
        filters.put(1, "Операционная система");
        filters.put(2, "Оперативная память");
        filters.put(3, "Объем жесткого диска");
        filters.put(4, "Размер экрана");
        filters.put(5, "Цена");

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите параметр фильтрации: ");
        filters.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        int filter = sc.nextInt();
        sc.close();
        List<String> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        List<Double> temp3 = new ArrayList<>();
        System.out.println("По вашему запросу: \n");
        StringBuilder sb = new StringBuilder();
        sb.append("| Бренд | " + filters.get(filter) + "|\n");

        for (var item : cmp) {
            if (filter == 1) {
                sb.append("| " + item.getBrand());
                sb.append(" | " + item.getOS() + "| \n");
                temp1.add(item.getOS());
            } else if (filter == 2) {
                sb.append("| " + item.getBrand());
                sb.append(" | " + item.getRAM() + "| \n");
                temp2.add(item.getRAM());
            } else if (filter == 3) {
                sb.append("| " + item.getBrand());
                sb.append(" | " + item.getHDD() + "| \n");
                temp2.add(item.getHDD());
            } else if (filter == 4) {
                sb.append("| " + item.getBrand());
                sb.append(" | " + item.getDiagonal() + "| \n");
                temp3.add(item.getDiagonal());
            } else if (filter == 5) {
                sb.append("| " +item.getBrand());
                sb.append(" | " + item.getPrice() + "| \n");
                temp3.add(item.getPrice());
            }
        }
        System.out.println(sb);
        System.out.println();
        List<Computer> compsList = new ArrayList<>();
        for (Computer x : cmp)
            compsList.add(x);
        Collections.sort(temp1);
        Collections.sort(temp2, Collections.reverseOrder());
        Collections.sort(temp3, Collections.reverseOrder());
        System.out.println("Отсортировано: \n");
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < compsList.size(); k++) {
                if (filter == 1) {
                    if (compsList.get(k).getOS().equals(temp1.get(j))) {
                        System.out.println(compsList.get(k));
                        compsList.remove(k);
                    }
                }
                else if (filter == 2) {
                    if (compsList.get(k).getRAM() == temp2.get(j)) {
                        System.out.println(compsList.get(k));
                        compsList.remove(k);
                    }
                }
                else if (filter == 3) {
                    if (compsList.get(k).getHDD() == temp2.get(j)) {
                        System.out.println(compsList.get(k));
                        compsList.remove(k);
                    }
                }
                else if (filter == 4) {
                    if (compsList.get(k).getDiagonal() == temp3.get(j)) {
                        System.out.println(compsList.get(k));
                        compsList.remove(k);
                    }
                }
                else if (filter == 5) {
                    if (compsList.get(k).getPrice() == temp3.get(j)) {
                        System.out.println(compsList.get(k));
                        compsList.remove(k);
                    }
                }
            }
        }
    }
}
