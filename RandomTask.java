//give an integer array return an array of size 3 that will be containing the first three min elements of the array
import java.util.*;
public class RandomTask {
    //approach 1 : tc -> O(nlogn), sc -> O(1)
    int[] min3(int[] arr){
        Arrays.sort(arr);
        int[] ans=new int[3];
        for(int i=0;i<3;i++)
            ans[i]=arr[i];
        return ans;
    }
}