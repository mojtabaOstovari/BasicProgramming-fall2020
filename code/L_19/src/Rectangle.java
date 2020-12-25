import java.util.Scanner;

public class Rectangle {

    static int count=0;
    static final double GOLDEN_RATIO = (1+Math.sqrt(5))/2;

    String name;
    double x;
    double y;
    Color color;

    Rectangle(String name, double x, double y, Color color){
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
        count++;
    }

    Rectangle(){
        this("rec0", 4);
    }

    Rectangle(String name, int x){
        this.name = name;
        this.x = x;
        this.y = x * GOLDEN_RATIO;
    }

    double area(){
        return this.x * this.y;
    }

    static Rectangle maxAreaRectangle(Rectangle[] rectangles){
        Rectangle r = rectangles[0];
        for (Rectangle rectangle : rectangles) {
            if (rectangle.area() > r.area()) {
                r = rectangle;
            }
        }
        return r;
    }

    static Rectangle[] rectanglesConstructor(int n, Scanner scanner){
        Rectangle[] R = new Rectangle[n];
        for (int i = 0; i < n; i++) {
            R[i] = new Rectangle("rec" + i, scanner.nextInt());
        }
        return R;
    }

    public String toString() {
        return "name: " + this.name + ", x: " + this.x + ", y: " + this.y;
    }

}

