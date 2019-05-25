package ListAndTables;

import java.util.HashMap;

/**
 * HashMap class implements and indexed table
 * e.g store student records and index via the student number
 * Adding new elements into this table won't spend more time search
 * search in constant time.
 *
 * For HashMap to work the ype of the key class must:
 * have the 'equals' method implemented
 * and the 'hasCode()' implemented
 * So if you used you own new class as key, you may need to implement
 * the equals and hashCode methods for your new class.
 */
public class HashmapPra {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("Nicole","u6604906");
        hm.put("Zizhang Chu","u5201314");
        hm.put("Nanami","u6604907");

        System.out.println(hm.get("Nicole"));


        /**
         * 'keySet' method can be used to traverse all the keys in a hash map
         * no guarantee on the order these entries would be returned in
         */
        for(String key: hm.keySet()){
            String value = hm.get(key);
            System.out.println(key + ":" + value);
        }
        // no entry sout null
        System.out.println(hm.get("1"));
    }
}
