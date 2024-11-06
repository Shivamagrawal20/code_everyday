

public class decimaltobinary
{
    // decimal to binary
    public static void main(String[] args)
    {
        int n=56;
        int [] arr = new int[32];
        for (int i = 0; i < 32; i++)
        {
            int temp=n%2;
            arr[31-i]=temp;
            n=n/2;
        }
        for (int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
