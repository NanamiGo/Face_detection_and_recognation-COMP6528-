package ListAndTables;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingScannerForInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()){
            int v =  input.nextInt();
            list.add(v*2);
            System.out.println(list);
        }

    }
}
