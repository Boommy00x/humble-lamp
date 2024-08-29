import java.util.Arrays;

public class CharacterCount {

    public static void countCharacters(String input) {
        // 1. รับสายตัวอักษรและเก็บใน inputS
        char[] inputS = input.toCharArray();
        
        // 2. เรียงลำดับข้อมูลใน inputS
        Arrays.sort(inputS);
        
        // 3. หาความยาวของ inputS
        int inputL = inputS.length;
        
        // 4. สร้างอาเรย์ letters และ lcounts
        char[] letters = new char[inputL];
        int[] lcounts = new int[inputL];
        
        // 5. กำหนดค่าเริ่มต้น
        int k = 0, count = 1;
        
        // 6. วนลูปจนครบทุกตัวในอาเรย์
        for (int i = 0; i < inputL; i++) {
            if (i == inputL - 1) {
                letters[k] = inputS[i];
                lcounts[k] = count;
                k++;
            } else if (inputS[i] == inputS[i + 1]) {
                count++;
            } else {
                letters[k] = inputS[i];
                lcounts[k] = count;
                k++;
                count = 1;
            }
        }
        
        // 7. แสดงผลลัพธ์
        for (int i = 0; i < k; i++) {
            System.out.println(letters[i] + " = " + lcounts[i]);
        }
    }

    public static void main(String[] args) {
        String input = "payap";
        countCharacters(input);
    }
}
