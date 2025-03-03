import java.math.BigInteger;

public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString();  // Correctly stores numeric data as a valid string
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);  // Maintains data integrity
    }
}
