import javax.swing.JOptionPane;

public class ExamChecker {
    public static void main(String[] args) {
        // ข้อมูลนักศึกษา
        String[][] students = {
            {"2559001", "สมหญิง", "90"},
            {"2559002", "สมชาย", "82"},
            {"2559003", "สมศักดิ์", "75"},
            {"2559004", "สมชาติ", "69"}
        };

        // รับ input รหัสนักศึกษา
        String inputCode = JOptionPane.showInputDialog("กรุณากรอกรหัสนักศึกษา:");

        // ตรวจสอบรหัสนักศึกษา
        boolean found = false;
        String name = "";
        String score = "";
        for (String[] student : students) {
            if (student[0].equals(inputCode)) {
                found = true;
                name = student[1];
                score = student[2];
                break;
            }
        }

        // แสดงผลตรวจสอบ
        if (found) {
            String grade = calculateGrade(Integer.parseInt(score));
            String message = "ชื่อ: " + name + "\n";
            message += "รหัส: " + inputCode + "\n";
            message += "คะแนน: " + score + "\n";
            message += "เกรด: " + grade;
            JOptionPane.showMessageDialog(null, message);
        } else {
            JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลนักศึกษา " + inputCode);
        }
    }

    // ฟังก์ชันในการคำนวณเกรด
    private static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}