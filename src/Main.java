import logic.Dice;


public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 50; i++) {
            System.out.println(Dice.roll());
        }
    }
}
