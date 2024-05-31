import java.util.*;
class RemoveDuplicate{
    
    public static void RemoveDuplicat(int arr[])
    {
        LinkedHashSet <Integer> set=new LinkedHashSet<Integer>();
        for(int number: arr)
        {
            set.add(number);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int arr[]={1,7,8,9,6,5,4,3,2,2,5,7,3};
        RemoveDuplicat(arr);
    }
}

