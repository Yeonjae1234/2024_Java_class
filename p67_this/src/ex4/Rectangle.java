package ex4;

public class Rectangle {
    int width;
    int height;

    Rectangle() {
        this(1, 1);  
    }

    Rectangle(int width) {
        this(width, 1);  
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void Area() {
        int area = this.width * this.height;
        System.out.println("area: " + area);
    }
}

