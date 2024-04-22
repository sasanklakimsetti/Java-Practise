// a tree is given , return the sum of all leaf nodes

import com.sun.source.tree.Tree;

import java.util.Scanner;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int i) {val=i;}
}

public class RandomTask3 {
    static int sum(TreeNode root){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return root.val;   // left and right nodes of root node should be null so that they can be considered as leaf nodes
        int ans1=sum(root.left);  // this will calculate sum of all left nodes
        int ans2=sum(root.right);  // this will calculate sum of all right nodes
        return ans1+ans2;
    }
    public static TreeNode insert(int[] arr, TreeNode root, int i) {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
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
        TreeNode root=insert(arr,null,0);
        int sum=sum(root);
        System.out.println("the sum is "+sum);
    }
}