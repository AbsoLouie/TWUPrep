package main.Chapter3;

public class Rectangle {
    private int height;
    private int width;


    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int area() {
        return height * width;
    }

    public int perimeter() {
        return 2*(height+width);
    }
}
