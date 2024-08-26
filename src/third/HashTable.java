package third;
import java.util.Hashtable;


public class HashTable {
    public static void main(String[] args) {
//        Hashtable<Integer, String> hashtable = new Hashtable<>(10);
//        hashtable.put(100, "Spongebob");
//        hashtable.put(123, "Patrick");
//        hashtable.put(321, "Sandy");
//        hashtable.put(555, "Squidward");
//        hashtable.put(777, "Gary");
//
//        //hashtable.remove(100);
//
//        for(Integer key : hashtable.keySet()) {
//            System.out.println(key.hashCode() % 10 + "\t"+ key + " \t " + hashtable.get(key));
//        }

//        7	777 	 Gary
//        5	555 	 Squidward
//        3	123 	 Patrick
//        1	321 	 Sandy

        Hashtable<String, String> hashtable = new Hashtable<>(10);
        hashtable.put("100", "Spongebob");
        hashtable.put("123", "Patrick");
        hashtable.put("321", "Sandy");
        hashtable.put("555", "Squidward");
        hashtable.put("777", "Gary");

        //hashtable.remove(100);

        for(String key : hashtable.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t"+ key + " \t " + hashtable.get(key));
        }
        //52629	555 	 Squidward
        //54615	777 	 Gary
        //48625	100 	 Spongebob
        //50610	321 	 Sandy
        //48690	123 	 Patrick
    }
}
