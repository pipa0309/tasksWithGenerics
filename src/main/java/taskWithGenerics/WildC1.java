package taskWithGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Пример ковариантности. Массивы ковариантны.
 */
public class WildC1 {
    Number[] number = new Integer[]{1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        WildC1 w1 = new WildC1();
        Number[] number = w1.number;
        for (int i = 0; i < number.length; i++) {
            System.out.print(i + " ");
        }
    }
}


/**
 * Пример инвариантности. Дженерики инвариантны.
 */
//class WildCar2 {
//    List<Number> numberList = new ArrayList<Integer>(); ошибка
//}


class WildC3 {
    //    List<? extends Number> numberList2 = new ArrayList<>(); ошибка
    List<Integer> numberList2 = new ArrayList<>();

    public static void main(String[] args) {
        WildC3 w3 = new WildC3();
        w3.addAndPrint();
    }

    private void addAndPrint() {
        numberList2.add(1);
        numberList2.add(2);
        numberList2.add(3);
        numberList2.forEach(el -> System.out.println(el));
    }
}

class WildC4 {

    private void addInList(List<? extends Number> numberList) {
        Object o = numberList.get(0);
//        System.out.println(o);
        System.out.println(numberList);
    }

    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.0,2.0));
        List<Integer> intList = new ArrayList<>(Arrays.asList(3,2,4));
        WildC4 w4 = new WildC4();
        w4.addInList(doubleList);
        w4.addInList(intList);
    }
}
