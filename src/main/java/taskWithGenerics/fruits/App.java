package taskWithGenerics.fruits;

public class App {
    public static void main(String[] args) {
        Box<Orange> orangeBox1 = new Box<>("OrangeBox1");
        orangeBox1.addFruit(new Orange(11));
        orangeBox1.addFruit(new Orange(6));
        orangeBox1.addFruit(new Orange(3));

        Box<Orange> orangeBox2 = new Box<>("OrangeBox2");
        orangeBox2.addFruit(new Orange(8));
        orangeBox2.addFruit(new Orange(7));

        Box<Apple> appleBox1 = new Box<>("AppleBox1");
        appleBox1.addFruit(new Apple(15));

        Box<Apple> appleBox2 = new Box<>("AppleBox2");
        appleBox2.addFruit(new Apple(6));
        appleBox2.addFruit(new Apple(9));

        orangeBox1.printBox();
        orangeBox1.getWeightBox();
        appleBox1.printBox();
        appleBox1.getWeightBox();
        orangeBox2.printBox();
        orangeBox2.getWeightBox();
        appleBox2.printBox();
        appleBox2.getWeightBox();

        System.out.println("-------------------------------------------\n");
        System.out.println(orangeBox2.compareWeightBox(appleBox1) + "\n");
        System.out.println(orangeBox1.compareWeightBox(appleBox2) + "\n");
        System.out.println("-------------------------------------------\n");

        orangeBox1.pourIntoToBox(orangeBox2);
        orangeBox1.printBox();
        orangeBox2.printBox();

        appleBox1.pourIntoToBox(appleBox2);
        appleBox1.printBox();
        appleBox2.printBox();
    }
}
