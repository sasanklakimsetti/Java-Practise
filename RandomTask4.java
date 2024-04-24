// sum of all leaf nodes which are left side to their parents

import java.util.Scanner;

class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;
    public TreeNode1(int x){val=x;}
}
public class RandomTask4 {
    // using dfs
    static int sum(TreeNode1 root, boolean flag){
        if(root==null) return 0;
        if(root.left==null&&root.right==null){
            return(flag==true?root.val:0);  // if the node is left to its parent then return value of the node else i.e. if the node is right to its parent then return 0
        }
        return sum(root.left, true)+sum(root.right,false);
        // true and false describes left and right
    }
    public static TreeNode1 insert(int[] arr, TreeNode1 root, int i) {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode1 temp = new TreeNode1(arr[i]);
            root = temp;
            // insert left child
            root.left = insert(arr, root.left, 2 * i + 1);
            // insert right child
            root.right = insert(arr, root.right, 2 * i + 2);
        }
        return root;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter height of the tree: "); int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        TreeNode1 root=insert(arr,null,0);
        int sum=sum(root,false);  // providing false coz the parent node is not left child of any parent
        System.out.println("the sum is "+sum);
    }
}