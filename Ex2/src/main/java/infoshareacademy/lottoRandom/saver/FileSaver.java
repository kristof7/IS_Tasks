package infoshareacademy.lottoRandom.saver;

import java.io.File;
import java.io.PrintWriter;

public class FileSaver implements FileSaverInterface {

    @Override
    public boolean toTXT(String data, String fileName) {
        fileName = fileName + ".txt";

        if (!checkIfExistFile(fileName)) {
            try {
                PrintWriter printWriter = new PrintWriter(fileName);
                printWriter.println("All numbers from random: ");
                printWriter.println(data);
                printWriter.close();
                System.out.println("File was saved!");

                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("The file name is occupied");
        System.out.println("The file hasn't been saved try enter another filename");

        return false;
    }

    private boolean checkIfExistFile(String filename) {
        File file = new File(filename);

        return file.exists();
    }
}
