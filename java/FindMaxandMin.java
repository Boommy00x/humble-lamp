import java.util.Scanner;

public class FindMaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Count For Find Max&Min");
        int count = sc.nextInt();
        long tmax, tmin;

        // Read the first value to initialize tmax and tmin
        System.out.println("Enter Number");
        tmax = tmin = sc.nextLong(); // ค่าเริ่มต้น

        // Process the remaining n-1 numbers
        for (int i = 1; i < count; i++) { 
            long d = sc.nextLong();

            if (d > tmax) {
                tmax = d;
            } else if (d < tmin) {
                tmin = d;
            }
        }
        System.out.println("Max&Min");
        System.out.println(tmin);
        System.out.println(tmax);
        
        sc.close();
    }
}