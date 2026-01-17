package problems;

import java.util.ArrayList;
import java.util.Formattable;

public class AryLst {
    public static void main(String[] args){
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>();
        L2.add(15);
        L2.add(16);
        L2.add(17);
        L1.add(6);
        L1.add(7);
        L1.add(8);
        L1.add(9);
        L1.addAll(L2); //to add l2 in l1 we can use addAll method
        L1.addFirst(0);

        // size() method is used to get the size of array
        for (int i=0;i<=L1.size();i++)
            System.out.println(L1.get(i));     // get() method is used to get array for i element
    }
}
