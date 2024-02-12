import java.util.*;
class Maximum
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(10);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            /*if(max<list.get(i))
            {
                max=list.get(i);
            }
            */
            //second appproach
            max=Math.max(max,list.get(i));
        }
        System.out.println("maximum no is="+max);
    }
}