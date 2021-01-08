import java.util.Scanner;

public class Th {
    static boolean checkAge(int age) throws AgeValidation {
        if (age < 10){
            throw new AgeValidation("invalid age");
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        try {
            User user = new User(name, age);
            System.out.println("Welcome");
        }
        catch (AgeValidation e){
            System.out.println("invalid age");
        }
        catch (Exception e){
            System.out.println("unknown exception");
        }
    }
}

class User{
    String name;
    int age;

    public User(String name, int age) throws AgeValidation {
        if (Th.checkAge(age)){
            this.name = name;
            this.age = age;
        }
    }
}

class AgeValidation extends Exception{
    AgeValidation(String msg){
        super(msg);
    }
}
