/**
 * Created by shixi006 on 2017/7/17.
 */
public class TestClass {
    public static void main(String[] args) {
        BST<Integer,String> bst = new BST();
        bst.put(7,"S");
        bst.put(1,"E");
        bst.put(4,"R");
        bst.put(3,"H");
        int s = bst.floor(2);
        System.out.println(s);
        
        bst.deleteMin();;
        
    }
}
