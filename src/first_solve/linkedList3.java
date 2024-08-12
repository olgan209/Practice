package first_solve;

import java.util.LinkedList;

public class linkedList3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("old");
        list.add("middle");
        list.add("old");
        list.add("end");

        String oldword = "old";
        String newword = "new";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldword)) {
                list.set(i, newword);
            }
        }

        System.out.println(list);
    }
}
//Создайте LinkedList строк. Напишите программу, которая
// заменяет все вхождения строки "old" на строку "new".
// Выведите обновленный список.
//Пример:
//Для списка ["old", "middle", "old", "end"] программа должна вывести ["new", "middle", "new", "end"].