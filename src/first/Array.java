package first;

import java.util.ArrayList;
import java.util.Arrays;

//Array and ArrayList
public class Array {
    public static void main(String[] args) {
        //array
        String[] friends = new String[3];
        String[] friends2 = {"May" , "John" , "Mike"};

        //arrayList
        ArrayList<String> friendsList = new ArrayList<>();
        ArrayList<String> friendsList2 = new ArrayList<>(Arrays.asList("May" , "John" , "Mike", "miki"));

        //how to get a value(by index)
        //array
        System.out.println(friends2[1]);
        //arrayList
        System.out.println(friendsList2.get(2));

        //how big a size
        System.out.println(friends2.length);
        System.out.println(friendsList2.size());

        //add an element
        friendsList2.add("Olha");
        System.out.println(friendsList2.get(4));

        //set a particular element
        friends2[0] = "Carl";
        friendsList2.set(4, "Carl");

        //remove
        //cant do this with arrays
        friendsList2.remove(0);

        //PRINT
        System.out.println(friends2); //use loop cs it doesnt work
        System.out.println(friendsList2);


    }
}
//Arrays size never changes once created
//ArrayList do not have a fixed size

//Arrays can hold primitives or objects (byte, short, int , long, float, double,char, boolean)
//ArrayList can only hold objects