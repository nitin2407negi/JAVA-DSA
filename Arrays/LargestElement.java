import java.util.*;
public class LargestElement {
     public static void main(String args[])
     {
        int arr[]={10,34,64,24,98,67};
        //largest element -1st method
        // int max=arr[0];
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>max)
        //     {
        //       max=arr[i];
        //     }
        // }
        // System.out.println("maximum element="+max);

        //2nd method
        Arrays.sort(arr);
        System.out.println("the maximum element is="+arr[arr.length-1]);

     }
}
