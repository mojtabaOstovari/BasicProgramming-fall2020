public class Client3 {
    public static void main(String[] args) {
        int i = MyInterface2.s;
        MyInterface2.f();

        MyInterface2 o = new Y();
        o.show("Hi");

    }
}

class X implements MyInterface1, MyInterface2 {

    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public void show(String text) {
        System.out.println(text);
    }
}

class Y extends X {

}


