import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

//        int a = 1;
//        int b = a>=0 ? a : -1 * a ;
//        System.out.println(b);

        int day = 2;
        String dayType;
        String dayString;
//
//        switch (day) {
//            case 1:
//                dayString = "Monday";
//                break;
//            case 2:
//                dayString = "Tuesday";
//                break;
//            case 3:
//                dayString = "Wednesday";
//                break;
//            case 4:
//                dayString = "Thursday";
//                break;
//            case 5:
//                dayString = "Friday";
//                break;
//            case 6:
//                dayString = "Saturday";
//                break;
//            case 7:
//                dayString = "Sunday";
//                break;
//            default:
//                dayString = "Invalid day";
//        }

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                dayType = "Weekday";
//                break;
//            case 6:
//            case 7:
//                dayType = "Weekend";
//                break;
//
//            default:
//                dayType = "Invalid daytype";
//        }

        int i;
        do {
            Scanner scanner = new Scanner(System.in);
            i= scanner.nextInt();
            System.out.println(i);
        }while (i != -1);


    }
}
