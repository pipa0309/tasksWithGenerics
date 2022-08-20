package taskWithGenerics;

public class MultiplayerOnTen {

    private void result(int digitUpTo10) {

        if (digitUpTo10 > 0 && digitUpTo10 <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(digitUpTo10 * i);
            }
        } else {
            System.out.println("input digit cannot be < 0 or > 10");
        }
    }

    public static void main(String[] args) {
        MultiplayerOnTen multiplayer2 = new MultiplayerOnTen();
        multiplayer2.result(0);
    }
}
