package taskWithGenerics.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final String name;
    private final List<T> boxList;

    public Box(String name) {
        this.name = name;
        this.boxList = new ArrayList<>();
    }

    public List<T> getBoxList() {
        return boxList;
    }

    public String getName() {
        return name;
    }

    public void addFruit(T fruit) {
        this.boxList.add(fruit);
    }

    public int getWeightBox() {
        int sum = 0;
        for (int i = 0; i < boxList.size(); i++) {
            sum += boxList.get(i).getWeigth();
        }
        return sum;
    }

    public void printBox() {
        System.out.println(getName() + "=" + getBoxList());
        System.out.printf("Weigh %s = %d u.d.\n\n", getName(), getWeightBox());
    }

    public boolean compareWeightBox(Box<? extends Fruit> anotherBoxList) {
        return getWeightBox() == anotherBoxList.getWeightBox();
    }

    public void pourIntoToBox(Box<T> anotherBox) {
        anotherBox.boxList.addAll(boxList);
        boxList.clear();
    }
}

