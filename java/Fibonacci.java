public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int[] fibonacciNumbers = new int[n];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        int sum = fibonacciNumbers[0] + fibonacciNumbers[1];

        // คำนวณเลข Fibonacci และรวมผลลัพธ์
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            sum += fibonacciNumbers[i];
        }

        // แสดงเลข Fibonacci
        System.out.print("The first 20 Fibonacci numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
        System.out.println();

        // คำนวณและแสดงค่าเฉลี่ย
        double average = (double) sum / n;
        System.out.println("The average is " + average);
    }
}
