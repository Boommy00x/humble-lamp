import java.util.Scanner;

public class Adnum{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int numInt1, numInt2 ,sumInt;
        
        System.out.print("Enter Num1 fo sum: ");
        numInt1 = input.nextInt();
        System.out.print("Enter Num2 fo sum: ");
        numInt2 = input.nextInt();
        sumInt = numInt1+numInt2;
        System.out.println("Sum of product is "+sumInt);
    }
}