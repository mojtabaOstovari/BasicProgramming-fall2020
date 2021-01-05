import java.util.LinkedList;

public class Client2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(8);
        System.out.println(b.p);

        B b1 = new B();
        B b2 = new B();
        B.increaseAllB(7);

    }
}


class A extends Object{
    int p;
}

class B extends A{
    static int count = 0;
    static LinkedList<B> allB = new LinkedList<>();

    int q;
    B(int q){
        super();
        count++;
        this.q = q;
        allB.add(this);
    }
    B(){
        count++;
        if (count%2==0){this.q=0;}
        else {this.q = 1;}
        allB.add(this);
    }

    static void increaseAllB(int i){
        for (B b : allB) {
            b.p += i;
        }
    }
}
