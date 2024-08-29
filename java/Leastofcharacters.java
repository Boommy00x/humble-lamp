import java.util.Scanner;

public class Leastofcharacters{

	public static void main(String[ ] agrs){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter String: ");
	String ip = sc.nextLine();
	char LoC = ip.charAt(0);
	for(int i =1; i<ip.length();i++){
	     if(ip.charAt(i)<LoC){
         LoC = ip.charAt(i);
	        }
	     }
	System.out.println("Least of Char of String : "+LoC);
            }
}