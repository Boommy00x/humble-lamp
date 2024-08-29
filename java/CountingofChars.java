import java.util.Arrays;
import java.util.Scanner;

public class CountingofChars {

    public static void countCharacters(String inputString) {
        // 1. รับstringและเก็บใน inputS
        char[] inputS= inputString.toCharArray();
        
        // 2. เรียงลำดับข้อมูลใน inputS
        Arrays.sort(inputS);
        
        // 3. หาความยาวของ inputS
        int inputL = inputS.length;

        // 4. สร้างอาเรย์ letters และ lcounts
        char[] letters = new char[inputL]; // ตัวแปรเก็บchar
        int[] lcounts = new int[inputL]; // ตัวแแปรนับchar
        
        // 5. กำหนดค่าเริ่มต้น
        int k = 0, count = 1;
        
        // 6. วนลูปจนครบทุกตัวในอาเรย์
        for(int i = 0;i < inputL;i++){
            if(i == inputL - 1 || inputS[i] != inputS[i+1]){ 
                //กรณีแรกเช็คตัวสุดท้าย กรณีที่2 เช็คcharที่ติดกันแต่ไม่เหมือนกัน
                letters[k]  = inputS[i]; // เก็บchar
                lcounts[k] = count ; // นับchar
                k++;    
                count = 1;  // เริ่มการนับใหม่
            }else{
                count++;
            }
        }
        
        // 7. แสดงผลลัพธ์
        for (int i = 0; i < k; i++) {
            System.out.println(letters[i] + " = " + lcounts[i]);
        }
    }

    public static void main(String[] args) {
        //สร้างตัวแปร inheritanceจากpackageScannerเพื่อเก็บข้อมูลจากแป้นพิมพ์ผู้ใช้งาน
        Scanner sc = new Scanner(System.in);

        System.out.println("===Program counting characters form text===");
        System.out.print("Typing whatever you want: ");
        String inpuString = sc.nextLine();
        
        countCharacters(inpuString);

    }
}
