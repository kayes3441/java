package Problem;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(90);
        num.add(60);
        num.add(1,100);

        System.out.print(" "+num);
        num.remove(1);
        System.out.println();
        System.out.print(" "+num);
        num.removeAll(num);
        System.out.println();
        System.out.print(" "+num);
        // System.out.println("Array List");
        // for(int x :num){
        //     System.out.print(" "+x);
        // }
        // System.out.println("Array size :"+num.size());
        // System.out.println();
        // System.out.println("Iteration");

        // Iterator itr = num.iterator();
        // while(itr.hasNext()){
        //     System.out.print(" "+itr.next());
        // }

    }
}
