package ListAndTables;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * what it's the difference between standard for loop
 */
public class RemovingElementsUsingAnIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //remove the even elements from the list
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer v =  iterator.next();
            if(v % 2 == 0 ){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
