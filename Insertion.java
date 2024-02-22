//insertion -> pick an element from an unsorted order and place it in right sorted part
class Insertion
{
    public static void Insertionn(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct position
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
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
        int arr[]={5,7,2,4,10,3};
        Insertionn(arr);
        printt(arr);

    }
}