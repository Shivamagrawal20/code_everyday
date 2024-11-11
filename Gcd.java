public class Gcd
{
    public static void main(String[] args)
    {
        int a=1101;
        int sum=0;
        int i=1;
        //euclideam theoram for GCD
        while(a>0)
        {
            int b=a%10;
            sum=sum+b*i;
            i=i*2;
            a=a/10;
        }
        System.out.println(sum);
    }
}

