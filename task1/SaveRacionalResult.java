import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveRacionalResult extends ValuesNumbers {

    public void SaveResultRacional(CalculateRacional calculateRational, RacionalNumbers racionalNumbers) {

        Path path = Paths.get("ComplexResult.txt"); 
        String contents = "Первое число: "+ calculateRational.getX() + "/" + calculateRational.getY() +
        " Второе число: " + calculateRational.getW() + "/" + calculateRational.getZ() +
        " Результат операции: " + racionalNumbers.getX() + "/" + racionalNumbers.getY();
 
        try { 
        Files.writeString(path, contents, StandardCharsets.UTF_8); 
        } catch (IOException ex) { 

        } 
    } 
}