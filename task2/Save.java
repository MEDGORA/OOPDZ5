package task2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Save {

    public void Save() {

        Path path = Paths.get("Save.txt"); 
        String contents = "" + Person.arrayOfPersons;
 
        try { 
        Files.writeString(path, contents, StandardCharsets.UTF_8); 
        } catch (IOException ex) { 

        } 
    } 
}
