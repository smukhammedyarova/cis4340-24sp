import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();  // Issue: Can't represent unsigned 32-bit values
    }
}
