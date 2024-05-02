import java.util.Scanner;

//Given a root of BT, return true if the left and right subtree are identical or not
class Tree{
    int val;
    Tree left;
    Tree right;
    public Tree(int val){
        this.val=val;
    }
}
public class RandomTask5 {
    public static Tree insert(int[] arr, Tree root, int i) {
        if (i < arr.length) {
            Tree temp = new Tree(arr[i]);
            root = temp;
            root.left = insert(arr, root.left, 2 * i + 1);
            root.right = insert(arr, root.right, 2 * i + 2);
        }
        return root;
    }
    static boolean preorder(Tree r1, Tree r2){
        if(r1==null||r2==null) return r1==r2;
        if(r1.val!=r2.val) return false;
        else {
            boolean ans1 = preorder(r1.left, r2.left);
            boolean ans2 = preorder(r1.right, r2.right);
            return ans1 && ans2;
        }
    }
    static boolean isSame(Tree root){
        if(root==null) return true;
        return preorder(root.left,root.right);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter height of the tree: "); int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Tree root=insert(arr,null,0);
        System.out.println(isSame(root));
    }
}