public class Client {
    public static void main(String[] args) throws ArithmeticException{
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("hi");
        }
        throw new ArithmeticException("HELLO");

    }
}
