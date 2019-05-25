package ListAndTables;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The ArrayListPra can store a list of objects.
 */
public class ArrayListPra {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        /*add the item to the end of the list*/
        list.add("Hello");
        list.add("world");

        /*inserts the item at position 'index' shifting the elements after this position one by one*/
        list.add(1,",");

        /*replace the element at 'index' with 'item*/
        list.set(0,"Hi");

        /*return the element at position 'index' */
        list.get(0);

        /*remove the element at position 'index' shifting the elements after this back*/
        list.remove(1);

        /*remove the first instance of 'item' in the list*/
        list.add("world");
        list.remove("world");
        System.out.println(list);

        /*the simplest way for processing each element in a list*/
        for(String str: list){
            str +=str;
            System.out.println("foreach :"+str);
        }

        /*easily modified to traverse the list in different order*/
        for(int i = 0; i < list.size();i++){
            String str = list.get(i);
            System.out.println("Standard for :"+ str);
        }

        /*give a reference to the interator in the loop
        * Useful when remove elements from the list as you iterate over them*/
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();
            System.out.println("iterator :" + string);
        }



    }

}
