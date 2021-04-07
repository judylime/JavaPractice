package AlgorithmBasic.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean
        List<Integer> newList = new ArrayList<Integer>();
        newList.add(1);
        newList.add(9);
        System.out.println(newList.get(0));
        System.out.println(newList.size());
    }
}
