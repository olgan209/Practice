package second;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsStudy {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");
        names.add("Bob");
        System.out.println(names);

        names.remove("John");
        for (String name : names) {
            System.out.println(name);
        }
        //or
        names.forEach(System.out::println);
        //or
        Iterator<String> namesIter = names.iterator();
        while (namesIter.hasNext()) {
            System.out.println(namesIter.next());
        }
    }
}
