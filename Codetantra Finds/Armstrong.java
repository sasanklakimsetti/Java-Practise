//check  whether a number is Armstrong number or not
//this has been using cmd line arguments
public class Armstrong {
    public static void main(String[] args){
        int size=args[0].length();    //since the args array is of string type
        int num=Integer.parseInt(args[0]);
        char[] arr=args[0].toCharArray();
        int sum=0;
        boolean check=false;
        for(int i=0;i<size;i++){
            sum+=Math.pow(Character.getNumericValue(arr[i]),size);
        }
        if(sum==num) System.out.println("The number "+args[0]+" is an armstrong number");
        else System.out.println("The number "+args[0]+" is not an armstrong number");
    }
}