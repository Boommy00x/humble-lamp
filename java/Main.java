// คลาสสำหรับสร้างโหนดในต้นไม้
class TreeNode {
    int value; // ค่าของโหนด
    TreeNode left; // โหนดลูกซ้าย
    TreeNode right; // โหนดลูกขวา

    // คอนสตรัคเตอร์สำหรับสร้างโหนด
    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// คลาสสำหรับต้นไม้
class BinaryTree {
    TreeNode root; // รากของต้นไม้

    // ฟังก์ชันสำหรับการท่องแบบ Preorder
    void preorderTraversal(TreeNode node) {
        if (node == null) {
            return; // ถ้าโหนดเป็น null ให้กลับ
        }
        
        // แสดงค่าของโหนดปัจจุบัน
        System.out.print(node.value + " ");
        
        // ท่องไปที่โหนดลูกซ้าย
        preorderTraversal(node.left);
        
        // ท่องไปที่โหนดลูกขวา
        preorderTraversal(node.right);
    }
}

public class Preoder {
    public static void main(String[] args) {
        // สร้างต้นไม้ตัวอย่าง
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // เรียกใช้ฟังก์ชันการท่องแบบ Preorder
        System.out.println("Preorder Traversal of the binary tree:");
        tree.preorderTraversal(tree.root); // ผลลัพธ์จะเป็น 1 2 4 5 3
    }
}