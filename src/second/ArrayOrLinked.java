package second;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayOrLinked {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }


//        LinkedList
        startTime = System.nanoTime();
//        linkedList.get(0);
//        linkedList.get(50000);
//        linkedList.get(99999);


//        linkedList.remove(0);
        linkedList.remove(50000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Linked List: " + elapsedTime + " ns");
//       ArrayList
        startTime = System.nanoTime();
//        arrayList.get(0);
//        arrayList.get(50000);
//        arrayList.get(999999);
//        arrayList.remove(50000);

        arrayList.remove(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Array List: " + elapsedTime + " ns");

    }
//    get:
//    Linked List: 15700 ns
//    Array List: 4200 ns

    //    get 50000:
//    Linked List: 964300 ns
//    Array List: 4200 ns

    //    get 99999:
//    Linked List: 1638300 ns
//    Array List: 6600 ns

    //    remove 0:
//    Linked List: 15300 ns
//    Array List: 875200 ns

}
