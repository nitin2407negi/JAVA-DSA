
class Bubblesort
{
    public static void Bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void printt(int arr[])
    {
        System.out.print("sorted array is= ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
    }
    public static void main(String args[])
    {
        int arr[]={3,9,1,8,3,2};
        Bubble(arr);
        printt(arr);
    }
}