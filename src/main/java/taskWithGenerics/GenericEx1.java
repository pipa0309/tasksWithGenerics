package taskWithGenerics;

public class GenericEx1<T extends Number> {
    private final T field;

    public GenericEx1(T field) {
        this.field = field;
    }

    public void print() {
        System.out.println(field);
    }

    public static void main(String[] args) {
        GenericEx1 genericEx1 = new GenericEx1(10);
        GenericEx1 genericEx2 = new GenericEx1(10.0);
//        GenericEx1 genericEx3 = new GenericEx1("str");
        genericEx1.print();
        genericEx2.print();
    }
}
