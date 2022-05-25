package sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileService {

    public void saveToFile (List <String> list) {
        try(FileWriter fileWriter = new FileWriter("urls.txt", true); PrintWriter pw = new PrintWriter(fileWriter);) {
            for (String elem: list) {
                pw.print(elem + ", ");
            }
            System.out.println("Urls was succesfully saved!");
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
