/*Дана строка sql-запроса "select * from students where".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации:
String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …*/

import java.util.Arrays;

public class Query {
    public static void main(String[] args) {
        String str = "select * from students where";
        String str1 = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        str1 = str1.replace("{", "");
        str1 = str1.replace("}", "");
        str1 = str1.replaceAll(":", " = ");
        str1 = str1.replace("\'", "\"");
        String[] array = str1.split(",");
        System.out.println(Arrays.toString(array));

        StringBuilder sb = new StringBuilder(str);
        sb.append(" ");
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            index = array[i].indexOf("=") + 3;
            if (!array[i].substring(index).startsWith("null")) {
                sb.append(array[i]).append(" and");
            }
            if ((i == array.length - 1) && (sb.toString().endsWith("and"))) {
                sb.delete(sb.length() - 3, sb.length());
            }
        }
        System.out.println(sb.toString());
    }
}

