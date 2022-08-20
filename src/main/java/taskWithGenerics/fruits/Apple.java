package taskWithGenerics.fruits;

public class Apple extends Fruit {
    protected Apple(int weigth) {
        super(weigth);
    }

    @Override
    public String toString() {
        return "apple{" +
                "weigth=" + weigth +
                '}';
    }
}
