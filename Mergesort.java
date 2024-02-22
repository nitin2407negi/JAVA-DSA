class Mergesort
{
    public static void Merge(int arr[],int s,int e)
    {
        //base case
        if(s>=e)
        {
            return;
        }
        //kaam
        int mid=s+(e-s)/2;
        Merge(arr,s,mid);  //left part
        Merge(arr,mid+1,e); //right part
        merging(arr, s, mid, e);

        
    }
    //merge method to merge
    public static void merging(int arr[],int s,int mid,int e)
    {
        int temp[]=new int[e-s+1]; 
        int i=s;  //iterator for left part
        int j=mid+1; //iterator for right part
        int k=0;   //iterator for temp array
        while(i<=mid && j<=e)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }

            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for leftover element of 1st sorted order
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        //for rightover element of 2nd sorted order
        while(j<=e)
        {
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k=0,i=s;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
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
        int arr[]={2,1,5,3,8,4};
        Merge(arr,0,arr.length-1);
        printt(arr);

    }
}