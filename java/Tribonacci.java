public class Tribonacci {
    public static void main(String[] args) {
        int n = 20;
        int[] tribonacciNumbers = new int[n];

        // กำหนดค่าเริ่มต้นตามโจทย์
        tribonacciNumbers[0] = 1; // T(1)
        tribonacciNumbers[1] = 1; // T(2)
        tribonacciNumbers[2] = 2; // T(3)

        // คำนวณเลข Tribonacci ตั้งแต่ตำแหน่งที่ 4 เป็นต้นไป
        for (int i = 3; i < n; i++) {
            tribonacciNumbers[i] = tribonacciNumbers[i - 1] + tribonacciNumbers[i - 2] + tribonacciNumbers[i - 3];
        }

        // แสดงเลข Tribonacci
        System.out.print("The first 20 Tribonacci numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tribonacciNumbers[i] + " ");
        }
    }
}
