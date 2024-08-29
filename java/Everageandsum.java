import java.util.Scanner;

public class Everageandsum{

	public static void main(String[ ] agrs){
	Scanner sc = new Scanner(System.in);
	double av;
	long sum = 0;
	System.out.print("Enter count for Sum: ");
	int count = sc.nextInt();
	for(int i = 0;i<count;i++){
	System.out.print("Enter number ROUND"+(i+1)+": ");
	int num = sc.nextInt();
	sum += num;
	}
	av = sum/count;
	System.out.println("Sum of product is: "+sum);
	System.out.println("Average of product is: "+av);
	}
}