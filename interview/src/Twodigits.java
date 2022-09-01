public class Twodigits
{
    public static void main (String[] args) 
    {
        int digit=2;
        int x=26;
        int counter=0;
        
        for(int i=1; i<x; i++)
        {
            int n=i;
            while(n>0)
            {
                int mode = n%10; 
                n = n/10;
                if(mode==digit)
                {
                    counter++;
                }
            }
        }
        System.out.println("counter =" + counter);
    }
}