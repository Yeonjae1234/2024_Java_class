package ex4;

public class Student {
    private static int serialNum=1000;

    int stID;


    //serialNum에 대한 get메서드. 클래스 메서드

    public static int getSerialNum() {

        return serialNum;
    }

    //serialNum에 대한 set메서드. 클래스 메서드

    public static void setSerialNum(int serialNum) {

        Student.serialNum = serialNum;
    }
}
