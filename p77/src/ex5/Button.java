package ex5;

public class Button {
    static String mode = "LIGHT";
    static void switchMode () {
        if (mode.equals("LIGHT")){
            mode = "DARK";
        }
        else{
            mode = "LIGHT";
        }
    }

    char print;
    int space;

    Button (char print, int space) {
        this.print = print;
        this.space = space;
    }

    void place () {
        System.out.println("표시: "+print+", 공간: "+space+", 모드: "+mode);
    }
}
