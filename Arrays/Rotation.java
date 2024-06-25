public class Rotation {
    public static void main(String args[])
    {
        int arr[]={2, 3, 4, 5, 1};
        //left rotation

        
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println("left rotation: ");

        for (int i : arr) {
            System.out.print(i+",");
        }
        

        System.out.println();
       
        // Right rotation
        
        int tempRight = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = tempRight;

        System.out.println("Right Rotation: ");
        for (int i : arr) {
            System.out.print(i + ",");
        }

    }
}
