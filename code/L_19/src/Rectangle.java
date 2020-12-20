public class Rectangle {

    String name;
    double x;
    double y;

    Rectangle(String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    Rectangle(double x, double y){
        this.x = x;
        this.y = y;
    }

    Rectangle(){
        this.x = 4;
        this.y = 4;
    }
}
