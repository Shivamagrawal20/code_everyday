
public class Maxno
{
    public static void main(String[] args)
    {
        // find 3 time duplicate element EOX
        int [] arr={1,2,3,3,2,6,4,4,6,6,1};
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {     
            sum=sum^arr[i];
        }
        System.out.println(sum);
    }
}
