public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Input cannot be Integer.MIN_VALUE");
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException("Integer overflow risk detected");
        }
        return absX + absY;
    }
}
