package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] nums = new int[5];
       /* ArrayList list = new ArrayList();
        list.add("Shivam");
        list.add(12.2f);
        list.add(1.23);
       */
        /* Object o = list.get(0);
        System.out.println(o);*//*
        *//*
        Required type: String
        Provided: Object
        Solution -> type cast (String)
        *//*
        String str1 = (String) list.get(0);

        System.out.println(str1);
*//*
        Required type: Integer
        Provided: Object
        Solution -> type cast (Integer)
        *//*
        *//*
        if list.add(1.23)
        Exception Code
        Float cannot be cast to class java.lang.Integer
        store in int or String
        Type safety issues & manual casting
        No Compile time checking
         */
        /*
        Integer integer = (Integer)list.get(1);
        System.out.println(integer);*/
        // Diamond Operator Replace <String> -> <>
        ArrayList<String> list = new ArrayList<>();
        list.add("Sam");
//        list.add(2); -> Not Add Int Or Other Only String
        /*
        T:  Type
        E:  Element (Used in collections)
        K:  Key (Used in maps)
        V:  Value (used in maps)
        N:  Number
        */






    }
}
