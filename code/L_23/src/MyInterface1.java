public interface MyInterface1 {
    void print();
    int sum(int a, int b);
}

interface MyInterface2 {
    int s = 5;
    static void f(){
        System.out.println("w");
    }
    void show(String text);
}

interface MyInterface3 extends MyInterface1, MyInterface2{

}