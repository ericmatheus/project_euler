public class Problem002 {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(z);
            z = x + y;
            x = y;
            y = z;
        }
    }
}
