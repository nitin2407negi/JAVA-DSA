class ShortestPath
{
    public static float getDirection(String Path)
    {
        int x=0,y=0;
        for(int i=0;i<Path.length();i++)
        {
           char dir=Path.charAt(i);
           //north
           if(dir=='N')
           {
             y++;
           }
           //south
           else if(dir=='S')
           {
            y--;
           }
           //east
           else if(dir=='E')
           {
            x++;
           }
           //west
           else
           {
            x--;
           }
        }
        int xsqr=x*x;
        int ysqr=y*y;
        return (float)Math.sqrt(xsqr+ysqr);  //type cast to float and square root of x and y
    }
    public static void main(String args[])
    {
        String Path="WNEENESENNN";
        System.out.println(getDirection(Path));
    }
}