import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveComplexResult extends ValuesNumbers {

    public void SaveResultComplex(CalculateComplex calculateComplex, ComplexNumbers complexNumbers) {

        Path path = Paths.get("ComplexResult.txt"); 
        String contents = "Первое число: "+ calculateComplex.getX() + " + " + calculateComplex.getY() + "i" + 
        " Второе число: " + calculateComplex.getW() + " + " + calculateComplex.getZ() +"i" +
        " Результат операции: " + complexNumbers.getX() + " + " + complexNumbers.getY() + "i";
 
        try { 
        Files.writeString(path, contents, StandardCharsets.UTF_8); 
        } catch (IOException ex) { 

        } 
    } 
}
