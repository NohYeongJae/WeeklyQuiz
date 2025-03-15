package chap02;

import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        /*오토 박싱*/
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("ArrayList: " + arrayList);

        int index = 20;
        Integer intObject = index;

        index = intObject;
        System.out.println("index: " + index);
    }
}
