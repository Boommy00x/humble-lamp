public class ShowstarPattern {
    public static void main(String[] args) {
        int height = 11; 

        for (int i = 0; i < height; i++) {
            // ซ้าย
            for (int j = 0; j < height - i; j++) {
                System.out.print("*");
            }
            // กลาง
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            // ขวา
            for (int j = 0; j < height - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}