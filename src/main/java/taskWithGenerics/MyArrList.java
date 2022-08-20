package taskWithGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrList<T> {
    /* *
     * Return list with help of Arrays.asList
     */
    public List<T> asListMake(T[] arr) {
        List<T> list = Arrays.asList(arr);
        return list;
    }

    /**
     * Return list with help of cycle for
     */
    public List<T> toArrayList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}

class AppMyArrList {
    public static void main(String[] args) {
        Integer[] arrTest = new Integer[]{1, 2, 3, 4};
        MyArrList<Integer> mArrLInt = new MyArrList<>();

        List<Integer> integers1 = mArrLInt.asListMake(arrTest);
        integers1.forEach(elem -> System.out.print(elem + " "));

        System.out.println();

        List<Integer> integers2 = mArrLInt.toArrayList(arrTest);
        integers2.forEach(elem -> System.out.print(elem + " "));
    }
}

