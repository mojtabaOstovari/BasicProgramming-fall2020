import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        int[] A = new int[5];
        //A[5]++;
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a/b;
            System.out.println(A[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index out");
        }
        catch (ArithmeticException e){
            System.out.println("divide by zero");
            A[5]++;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {

        }









    }

}
