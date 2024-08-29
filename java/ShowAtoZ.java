public class ShowAtoZ {
    public static void main(String[] args) {
        
        char start = 'A';
        char end = 'Z';
        System.out.println("=================== TABLE A TO Z ==================");
        while (start <= end){
            System.out.printf(start+" ");
            start ++;
        }
        System.out.print("\n===================================================\n");
    }
}
