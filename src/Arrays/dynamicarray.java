package Arrays;

import java.util.ArrayList;

public class dynamicarray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.print(list);
        System.out.println(" ");
        list.remove(5);
        System.out.println(list);
        boolean contains = list.contains(40);
        System.out.print(contains);
    }
}
