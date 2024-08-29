import java.util.Scanner;

    public class Grading{
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int x = 0;
            System.out.println("Enter 3 Scores");
            for(int i = 0;i<3;i++){
                x += sc.nextInt();
            }
            check(x);
            sc.close();
        }
        public static void check(int x){
            int[][] point = {{80,100},{75,79},{70,74},{65,69},{60,64},{55,59},{50,54},{0,49}};
            String[] grade = {"A","B+","B","C+","C","D+","D","F"};
            for(int i = 0;i<point.length;i++){
                if(x>=point[i][0]&&x<=point[i][1]){
                    System.out.println("GRADE : "+grade[i]);
                    break;
                }
            }
      }
}

