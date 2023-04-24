public class Main {
    public static void main(String[] args) {
        
    }
    public static String numberFormatter(int value) {
        String str = String.valueOf(value);
        StringBuilder sb = new StringBuilder(str);
        for (int i = sb.length() - 1; i > 0; i--)

            if (i % 3 == 0) {
                sb.insert(sb.length() - i, "_");
            }
        return sb.toString();
    }
}
