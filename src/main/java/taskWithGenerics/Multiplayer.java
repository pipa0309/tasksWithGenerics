package taskWithGenerics;

public class Multiplayer {
    private final int numOne;
    private final int numTwo;

    public Multiplayer(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    private int multi() {
        return this.numOne * this.numTwo;
    }

    public static void main(String[] args) {
        Multiplayer task1 = new Multiplayer(5, 6);
        int multi = task1.multi();
        System.out.println(multi);
    }
}
