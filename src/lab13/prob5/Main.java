package lab13.prob5;

import java.util.List;

public class Main {
    public static <T> T secondSmallest(List<T> myList) {
        return myList.stream().sorted().limit(2).toList().getLast();
    }


    public static void main(String[] args) {
        List<Integer> list = List.of(16, 2, 3, 4, 5, 5, 6, 7, 9);
        Integer aaa = secondSmallest(list);
        System.out.println(aaa);
    }
}
