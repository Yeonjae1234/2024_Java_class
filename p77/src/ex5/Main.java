package ex5;

public class Main {
    public static void main(String[] args) {
        Button b1 = new Button('1', 1);
        Button bPlus = new Button('+', 3);
        Button bClear = new Button('C', 2);

        b1.place();
        bPlus.place();
        bClear.place();

        Button.switchMode();

        b1.place();
        bPlus.place();
        bClear.place();

    }
}
