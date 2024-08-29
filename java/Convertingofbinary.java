import java.util.Scanner;
public class Convertingofbinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryStr;
        boolean isValid;
        do {
            System.out.print("Enter a Binary string:");
            binaryStr = sc.nextLine();
            isValid = binaryStr.matches("[01]+");
            if (!isValid) {
                System.out.println("Error: Invalid Binary String \"" + binaryStr + "\"");
            }
           ;
        } while (!isValid);
         int decimalNumber = Integer.parseInt(binaryStr, 2);
         System.out.println("The equivalent decimal number for binary "+binaryStr+" is: "+decimalNumber);
    }
}
