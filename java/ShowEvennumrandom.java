public class ShowEvennumrandom {

    public static void main(String[] args) {
        
        int count=0;
        System.out.println("============ Even NUMBER =============");
        while(count < 100){
        int x = (int) (Math.random() *100);
            if(x % 2 != 1){
                
                if (x>20) {
                    System.out.print(" "+x+" ");
                    count++;
                    
                    if((count % 10) == 0){
                
                             System.out.println();
                         
                            }    
                }
                
            }
            
        }
        
    }
}
