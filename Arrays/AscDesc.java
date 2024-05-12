import java.util.*;
class AscDesc{
    public static void printOrder(int arr[],int n)
    {
        //sorting array
        Arrays.sort(arr);
        //printing 1st half of array in asceneding
        for(int i=0;i<n/2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //printing second half of array in descending
        for(int j=n-1;j>=n/2;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={3, 2, 4, 1, 10, 30, 40, 20};
        int n=arr.length;
        printOrder(arr, n);
    }
}