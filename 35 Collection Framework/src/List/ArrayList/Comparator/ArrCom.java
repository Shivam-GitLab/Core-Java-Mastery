package List.ArrayList.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLength implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length(); // descending Order
        // return s2.length() - s1.length(); // ascending Order
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer s1, Integer s2) {
        // return s1 - s2; // ascending Order
        return s2 - s1; // descending Order
        // if negative s1 - s2 -> s1 then s2
        // if zero s1 - s2 -> s1 & s2 same
        // if positive s1 - s2 -> s2 then s1
    }
}

public class ArrCom {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);


        list.sort(new MyComparator());
        // lambda expression
        list.sort((a,b) -> a - b);
        System.out.println(list);
        List<String> words = Arrays.asList("Banana", "Apple", "Date");
//        words.sort(new StringLength());
        // lambda expression
        words.sort((a,b) -> a.length() - b.length());
        System.out.println(words);
    }
}
