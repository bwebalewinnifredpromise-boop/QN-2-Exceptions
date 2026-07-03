import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceFix {
    public void readFileSafe(String path) {
        // Try-with-resources auto-closes the resource when leaving the scope
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("File processing error: " + e.getMessage());
        }
    }
}
