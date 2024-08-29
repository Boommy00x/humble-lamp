class TreeNode {
    int value; // ค่าของโหนด
    TreeNode left; // โหนดลูกซ้าย
    TreeNode right; // โหนดลูกขวา

    // คอนสตรัคเตอร์สำหรับสร้างโหนด 
    TreeNode(int value) {
        this.value = value;
        this.left = this.right =  null;
    }
}


class BinaryTree {
    TreeNode root; // รากของต้นไม้

    // ฟังก์ชันสำหรับการท่องแบบ Preorder
    void preorderTraversal(TreeNode node) {
        if (node == null) {
            return; 
        }
        
        
        System.out.print(node.value + " ");
        
        
        preorderTraversal(node.left);
        
        
        preorderTraversal(node.right);
    }
}

public class Preorder {
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree(); 
        tree.root = new TreeNode(1); //.root เป็นการเข้าถึง obj ที่ถูก instance มาจาก Binarytree สร้างโหนดใหม่ของประเภท TreeNode โดยมีค่า value เท่ากับ 1
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.left = new TreeNode(6);
        tree.root.right.left = new TreeNode(7);
        tree.root.right.left.right = new TreeNode(8);
        tree.root.right.right = new TreeNode(9);    
        System.out.println("Preorder Traversal of the binary tree:");
        tree.preorderTraversal(tree.root); 
    }
}

// class แรกเป็นclassใช้สำหรับสร้างโหนดในต้นไม้โดยแต่ละโหนด จะมีค่าเท่ากับvalue และชี้ไปยังโหนดลูกทางซ้ายและทางขวา
// TreeNode left;คือการประกาศตัวแปรชี้ไปยังโน้ตทางซ้าย โดยleftเป็นinstanceของTreeNode
// มีการคอนสรัคเตอร์สำหรับในการสร้างโหนดใหม่ โดยรับค่า value และตั้งค่าทางซ้ายและขวาให้เท่ากับ null ซึ่งหมายถึงว่ายังไม่มีลูก
// คำว่า this ใช้เพื่ออ้างอิงไปถึงobjที่ถูกสร้างขึ้น this.value หมายถึง value ของโหนดปัจจุบัน และvalueเป็นพารามิเตอร์ที่ถูกส่งมาในคอนสรัค
// ดังนั้นบรรทัดนี้จะเท่ากับค่าที่ส่งเข้ามา

// class ต่อมาเป็นคลาสbinarytree โดยคลาสนี้ใช้สำหรับสร้างต้นไม้โดยมีroot ใช้เก็บราก

// มีฟังก์ชันใช้สำหรับท่องต้นไม้ เข้าถึงโหนดปัจจุบันแล้วจึงจะไปลูกทางซ้ายและทางขวา
// ถ้าnodeเป็นnullจะออกจากฟังกืขันไม่ทำงานอะไรเลย
// ถ้าไม่เท่ากับnullจะแสดงค่าโหนดปัจจุบัน
// เรียกใช้ฟังก์ชันตัวเองเพื่อทำการท่องไปซ้าย และขวา

// ต่อมาเป็นclass preorderซึ่งคลาสนี้มีฟังก์ชันmainคือจุดเริ่มของโปรแกรม
// 	ในที่นี้ tree เป็น instance ของคลาส BinaryTreeและลูกซ้ายและลูกขวาจะถูกตั้งค่าเป็น null โดยอัตโนมัติ