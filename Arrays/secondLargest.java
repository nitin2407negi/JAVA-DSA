public class secondLargest {
    int arr[]={19,53,34,87,57,45};
    int max1,max2;
    public void findSecondLargest(){
        max1=max2=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("second largest element is="+max2);
    }
    public static void main(String[] args) {
        secondLargest ob=new secondLargest();
        ob.findSecondLargest();
    }
}
