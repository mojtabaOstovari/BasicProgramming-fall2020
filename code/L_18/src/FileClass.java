import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\S\\Desktop\\Folder\\A\\myText.txt";
        File file = new File(path);

        file.getParentFile().mkdirs();
        if (!file.exists()){
            file.createNewFile();
        }

//        for (File f : file.listFiles()) {
//            System.out.println(f);
//        }

//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNext()){
//            String s = scanner.nextLine();
//            System.out.println(s);
//        }
//        scanner.close();

        FileOutputStream fout = new FileOutputStream(file, false);
        PrintStream out = new PrintStream(fout);

        out.print("hi");
        out.println();
        out.print("sdjbfsdk jnfskdj");

        out.flush();
        out.close();


    }
}
