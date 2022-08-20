package taskWithGenerics;


public class Swaper<T> {
    private final T[] arr;

    public static void main(String[] args) {
        Integer[] arrI = new Integer[]{1, 2};
        Double[] arrD = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        String[] arrS = new String[]{"q", "w", "e", "r", "t", "y"};

        printArr(swapArr(arrI));
        printArr(swapArr(arrD));
        printArr(swapArr(arrS));
    }

    public Swaper(T[] arr) {
        this.arr = arr;
    }

    private static <T> T[] swapArr(T[] arr) {
        T tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return arr;
    }

    private static <T> void printArr(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
