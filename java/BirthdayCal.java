import java.util.Scanner;


public class BirthdayCal {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0,b = 0,c = 0;
    String[] Days = {"Sunday","Monday","Tuesday", "Wednesday", "Thursday", "Friday","Satursay"};
    System.out.println("======== Finding date of born ========");
    System.out.print("Enter years of born : ");
     int y = sc.nextInt();
    
     System.out.print("Enter months of born : ");
     int m = sc.nextInt();

     System.out.print("Enter days of born : ");
     int d = sc.nextInt();

    
    if(m <= 2){
        a = m+10;
        b = (y-1)%100;
        c = (y-1)/100;
       
    }else if( m >= 3){
        
        a = m-2;
        b = y%100;
        c = y/100;

    }
    int z =(700+(26*a-2)/10+d+ b+b/4+c/4-2*c)%7;
    System.out.println(Days[z]);
    
    }
}
