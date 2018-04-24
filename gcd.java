
public class gcd
{
    int n;
    public gcd(int num, int num1)
    {
        System.out.println(divide(num, num1));
    }

    public int divide(int a, int b){
        if(b<=a&& (a%b)==0)
            n=b;
        else if(a<b)
            divide(b,a);
        else
            divide(b,a%b);
        return n;
    }

}
