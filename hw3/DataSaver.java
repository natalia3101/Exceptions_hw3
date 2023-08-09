package hw3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataSaver {

    public static void savePersonInfo(Person person) throws IOException{
        try (FileWriter writer = new FileWriter(new File(person.surname + ".txt"), true)){
            writer.write(person.toString() + "\n");

        } catch(IOException e) {
            System.out.println(String.format("the file was not saved"));
        }
    }
  
}
