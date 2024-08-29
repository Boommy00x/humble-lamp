import java.util.Scanner;

public class Sumofproduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Totalincome = 0;
        
        for (int i = 1; i <= 7; i++) { // วนลูปสำหรับแต่ละวันในอาทิตย์
            System.out.print("======== Day "+i+"=========\n");
            System.out.print("Enter product number: ");
            int productNumber = sc.nextInt();
            System.out.print("Enter quantity sold: ");
            int quantitySold = sc.nextInt();
            
            double price;
            switch (productNumber) {
                case 1:
                    price = 500.0;
                    break;
                case 2:
                    price = 750.0;
                    break;
                case 3:
                    price = 850.0;
                    break;
                case 4:
                    price = 950.0;
                    break;
                case 5:
                    price = 1000.0;
                    break;
                default:
                    System.out.println("Invalid product number Enter Again.");
                    continue;
            }
            
            double income= price * quantitySold;
            Totalincome  += income;
            System.out.println("Income for day " + i + ": " + income);
        }
        
        System.out.println("\n Total Income for the week: " + Totalincome );
    }
}