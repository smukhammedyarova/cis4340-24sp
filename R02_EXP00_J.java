import java.io.File;

public class FileDeleter {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        someFile.delete();
    }
}
