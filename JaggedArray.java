public class JaggedArray {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5},{6,7,8,9}};
        //traversing the array using for-each loop
        for(int[] i : arr){
            for(var j:i){        //var is ntg but auto in c++ i.e. it will automatically detect the datatype.
                                 //it will only work with loops
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}