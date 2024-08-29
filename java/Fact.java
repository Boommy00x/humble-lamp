import java.util.Scanner;

public class Fact{

	public static void main(String[ ] agrs){
	Scanner sc = new Scanner(System.in);
	long factorial =1;
	System.out.print("Enter Num: ");
	long num = sc.nextInt();
	for(int i = 1; i<=num;i++){
	     factorial *= i;
	}
	System.out.println("Factorial of "+num+" = "+ factorial);
}
}