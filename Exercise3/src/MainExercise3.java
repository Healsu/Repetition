import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainExercise3 {
    public static void main(String[] args) {
        int counter =0;
        ArrayList<String> listOfStrings = new ArrayList<>();
        File fil = new File("Exercise3/src/ReadMe");
        try {

            Scanner scanner = new Scanner(fil);
            while (scanner.hasNextLine()) {
                String readMeWord = scanner.nextLine();
                listOfStrings.add(readMeWord);
                System.out.println(readMeWord);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR");
        }
        System.out.println("The amount of words in the file is: "+listOfStrings.size());
    }
}
